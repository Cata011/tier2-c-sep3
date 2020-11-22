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
        Account account = new Account(username, password);
        NetworkPackage networkPackage = new LoginEnum(NetworkType.LOGIN, account);
        String input = client.communicate(networkPackage);
        return gson.fromJson(input, Account.class);
    }

    @Override
    public void register(Account account) {
        NetworkPackage networkPackage = new RegisterEnum(NetworkType.REGISTER, account);
        client.communicate(networkPackage);
    }
}
