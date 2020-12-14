package group2.tier2csep3.networking.accountNetworking;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import group2.tier2csep3.model.account.Account;
import group2.tier2csep3.networking.communcation.SocketClient;
import group2.tier2csep3.networking.util.NetworkPackage;
import group2.tier2csep3.networking.util.NetworkType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

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
        NetworkPackage networkPackage = new NetworkPackage(NetworkType.LOGIN, serializedAccount);
        String input = client.communicate(networkPackage);
        return gson.fromJson(input, Account.class);
    }

    @Override
    public String register(Account account) {
        Gson gson = new Gson();
        String serializedAccount = gson.toJson(account);
        NetworkPackage networkPackage = new NetworkPackage(NetworkType.REGISTER, serializedAccount);
        return client.communicate(networkPackage);
    }

    @Override
    public String editAccount(Account account) {
        Gson gson = new Gson();
        String serializedAccount = gson.toJson(account);
        NetworkPackage networkPackage = new NetworkPackage(NetworkType.EDITACCOUNT, serializedAccount);
        return client.communicate(networkPackage);
    }

    @Override
    public void deleteAccount(int userId) {
        Gson gson = new Gson();
        NetworkPackage networkPackage = new NetworkPackage(NetworkType.DELETEACCOUNT, String.valueOf(userId));
        client.communicate(networkPackage);
    }

    @Override
    public Account getUserByUsername(String username) {
        Gson gson = new Gson();
        Account account = new Account();
        account.setUsername(username);

        String serializedAccount = gson.toJson(account);
        NetworkPackage networkPackage = new NetworkPackage(NetworkType.OTHERACCOUNT, serializedAccount);
        String input = client.communicate(networkPackage);

        return gson.fromJson(input, Account.class);
    }

    @Override
    public List<Account> getFollowedAccounts(int userId) {
        Gson gson = new Gson();
        NetworkPackage networkPackage = new NetworkPackage(NetworkType.FOLLOWEDACCOUNTS, String.valueOf(userId));
        String input = client.communicate(networkPackage);
        return gson.fromJson(input, new TypeToken<List<Account>>() {
        }.getType());
    }

    @Override
    public void followAccount(int userId, int userToFollow) {
        String s = userId + "*" +userToFollow;
        NetworkPackage networkPackage = new NetworkPackage(NetworkType.FOLLOW, s);
        client.communicate(networkPackage);
    }

    @Override
    public void unfollowAccount(int userId, int userToUnfollow) {
        String s = userId + "*" +userToUnfollow;

        System.out.println(s);

        NetworkPackage networkPackage = new NetworkPackage(NetworkType.UNFOLLOW, s);
        client.communicate(networkPackage);
    }

    @Override
    public Account getUserById(int userId) {
        Gson gson = new Gson();
        NetworkPackage networkPackage = new NetworkPackage(NetworkType.GETUSERBYID, String.valueOf(userId));
        String input = client.communicate(networkPackage);
        return gson.fromJson(input, Account.class);
    }
}
