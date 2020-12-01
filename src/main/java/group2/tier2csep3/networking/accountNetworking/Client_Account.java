package group2.tier2csep3.networking.accountNetworking;

import group2.tier2csep3.model.account.Account;

public interface Client_Account {
    Account validateAccount(String username, String password);

    void register(Account account);

    void editAccount(Account account);

    void deleteAccount(int userId);
}
