package group2.tier2csep3.service.accountService;

import group2.tier2csep3.model.account.Account;

public interface AccountService {
    Account getMyAccount(String Username, String Password);

    void register(Account account);
}
