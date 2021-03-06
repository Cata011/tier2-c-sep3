package group2.tier2csep3.service.accountService;

import group2.tier2csep3.model.account.Account;
import group2.tier2csep3.networking.accountNetworking.Client_Account;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    private Client_Account client_account;

    public AccountServiceImpl(Client_Account client_account) {
        this.client_account = client_account;
    }

    @Override
    public Account validateAccount(String username, String password) {
        return client_account.validateAccount(username, password);
    }

    @Override
    public String register(Account account) {
       return client_account.register(account);
    }

    @Override
    public String editAccount(Account account) {
        return client_account.editAccount(account);
    }

    @Override
    public void deleteAccount(int userId) {
        client_account.deleteAccount(userId);
    }

    @Override
    public Account getUserByUsername(String username) {
        return client_account.getUserByUsername(username);
    }

    @Override
    public List<Account> getFollowedAccounts(int userId) {
        return client_account.getFollowedAccounts(userId);
    }

    @Override
    public void followAccount(int userId, int userToFollow) {
        client_account.followAccount(userId, userToFollow);
    }

    @Override
    public void unfollowAccount(int userId, int userToUnfollow) {
        client_account.unfollowAccount(userId, userToUnfollow);
    }

    @Override
    public Account getUserById(int userId) {
        return client_account.getUserById(userId);
    }
}
