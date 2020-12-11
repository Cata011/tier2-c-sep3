package group2.tier2csep3.service.accountService;

import group2.tier2csep3.model.account.Account;

import java.util.List;

public interface AccountService {
    Account validateAccount(String Username, String Password);

    String register(Account account);

    String editAccount(Account account);

    void deleteAccount(int userId);

    Account getUserByUsername(String username);

    List<Account> getFollowedAccounts(int userId);

    void followAccount(int userId, int userToFollow);

    void unfollowAccount(int userId, int userToUnfollow);

    Account getUserById(int userId);
}
