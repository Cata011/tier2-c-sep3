package group2.tier2csep3.controllers;

import group2.tier2csep3.model.account.Account;
import group2.tier2csep3.service.accountService.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping("/accounts?UserName={username}&Password={password}")
    public Account getMyAccount(@PathVariable String username, @PathVariable String password) {
        return accountService.getMyAccount(username, password);
    }

    @PostMapping("/accounts")
    public void register(@RequestBody Account account) {
        accountService.register(account);
    }
}
