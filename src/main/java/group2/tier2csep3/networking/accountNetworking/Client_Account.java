package group2.tier2csep3.networking.accountNetworking;

import group2.tier2csep3.model.account.Account;

public interface Client_Account {
    Account validateAccount(String username, String password);

    String register(Account account);

    String editAccount(Account account);

    void deleteAccount(int userId);

    Account getUserByUsername(String username);
}
