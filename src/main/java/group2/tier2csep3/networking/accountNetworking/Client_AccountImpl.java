package group2.tier2csep3.networking.accountNetworking;

import com.google.gson.Gson;
import group2.tier2csep3.model.account.Account;
import group2.tier2csep3.networking.communcation.SocketClient;
import group2.tier2csep3.networking.util.*;
import group2.tier2csep3.networking.util.accountEnums.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Client_AccountImpl implements Client_Account {

    @Autowired
    private SocketClient client;

    @Override
    public Account validateAccount(String username, String password) {
        Gson gson = new Gson();
        Account account = new Account();
        account.setUsername(username);
        account.setPassword(password);
        String serializedAccount = gson.toJson(account);
        NetworkPackage networkPackage = new LoginEnum(NetworkType.LOGIN, serializedAccount);
        String input = client.communicate(networkPackage);
        return gson.fromJson(input, Account.class);
    }

    @Override
    public String register(Account account) {
        Gson gson = new Gson();
        String serializedAccount = gson.toJson(account);
        NetworkPackage networkPackage = new RegisterEnum(NetworkType.REGISTER, serializedAccount);
        return client.communicate(networkPackage);
    }

    @Override
    public String editAccount(Account account) {
        Gson gson = new Gson();
        String serializedAccount = gson.toJson(account);
        NetworkPackage networkPackage = new EditAccountEnum(NetworkType.EDITACCOUNT, serializedAccount);
        return client.communicate(networkPackage);
    }

    @Override
    public void deleteAccount(int userId) {
        Gson gson = new Gson();
        NetworkPackage networkPackage = new DeleteAccountEnum(NetworkType.DELETEACCOUNT, String.valueOf(userId));
        client.communicate(networkPackage);
    }

    @Override
    public Account getUserByUsername(String username) {
        Gson gson = new Gson();
        Account account = new Account();
        account.setUsername(username);

        String serializedAccount = gson.toJson(account);
        NetworkPackage networkPackage = new OtherAccountEnum(NetworkType.OTHERACCOUNT, serializedAccount);
        String input = client.communicate(networkPackage);

        System.out.println("Tier2" + input);

        Account dummy = gson.fromJson(input, Account.class);

        System.out.println(dummy.getPosts());

        return dummy;
    }
}
