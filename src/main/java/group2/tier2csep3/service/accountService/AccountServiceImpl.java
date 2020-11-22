package group2.tier2csep3.service.accountService;

import group2.tier2csep3.model.account.Account;
import group2.tier2csep3.networking.accountNetworking.Client_Account;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private Account account;
    private Client_Account client_account;

    public AccountServiceImpl(Client_Account client_account) {
        this.account = new Account();
        this.client_account = client_account;
    }

    @Override
    public Account getMyAccount(String username, String password) {
        return client_account.getMyAccount(username, password);
    }

    @Override
    public void register(Account account) {
        client_account.register(account);
    }
}
