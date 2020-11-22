package group2.tier2csep3.networking.accountNetworking;

import group2.tier2csep3.model.account.Account;

public interface Client_Account {
    Account getMyAccount(String username, String password);

    void register(Account account);
}
