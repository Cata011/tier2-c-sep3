package group2.tier2csep3.service.accountService;

import group2.tier2csep3.model.account.Account;

public interface AccountService {
    Account validateAccount(String Username, String Password);

    void register(Account account);

    void editAccount(Account account);

    void deleteAccount(int userId);
}
