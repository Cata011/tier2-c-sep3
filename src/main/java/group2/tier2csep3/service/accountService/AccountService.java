package group2.tier2csep3.service.accountService;

import group2.tier2csep3.model.account.Account;

public interface AccountService {
    Account validateAccount(String Username, String Password);

    String register(Account account);

    String editAccount(Account account);

    void deleteAccount(int userId);

    Account getUserByUsername(String username);
}
