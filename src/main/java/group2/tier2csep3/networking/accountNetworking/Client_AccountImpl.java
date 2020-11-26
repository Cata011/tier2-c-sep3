package group2.tier2csep3.networking.accountNetworking;

import com.google.gson.Gson;
import group2.tier2csep3.model.account.Account;
import group2.tier2csep3.networking.communcation.SocketClient;
import group2.tier2csep3.networking.util.LoginEnum;
import group2.tier2csep3.networking.util.NetworkPackage;
import group2.tier2csep3.networking.util.NetworkType;
import group2.tier2csep3.networking.util.RegisterEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Client_AccountImpl implements Client_Account {
    @Autowired
    private SocketClient client; //TODO: or use normal dependency
    @Override
    public Account getMyAccount(String username, String password) {
        Gson gson = new Gson();
        Account account = new Account();
        account.setUsername(username);
        account.setPassword(password);
        String serializedAccount = gson.toJson(account);
        NetworkPackage networkPackage = new LoginEnum(NetworkType.LOGIN, serializedAccount);
        String input = client.communicate(networkPackage);

        System.out.println("ZZZZZZZZZ " + input);

        return gson.fromJson(input, Account.class);
    }

    @Override
    public void register(Account account) {
        Gson gson = new Gson();
        String serializedAccount = gson.toJson(account);
        NetworkPackage networkPackage = new RegisterEnum(NetworkType.REGISTER, serializedAccount);
        client.communicate(networkPackage);
    }
}
