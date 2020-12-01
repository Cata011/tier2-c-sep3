package group2.tier2csep3.controllers;

import group2.tier2csep3.model.account.Account;
import group2.tier2csep3.service.accountService.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping("/login")
    public Account getMyAccount(@RequestBody Account account) {
                return accountService.validateAccount(account.getUsername(), account.getPassword());
    }

    @PostMapping("/register")
    public void register(@RequestBody Account account) {
        System.out.println(account);
        accountService.register(account);
    }

    @PatchMapping("/accounts")
    public void editAccount(@RequestBody Account account)
    {
        accountService.editAccount(account);
    }

    @DeleteMapping("/accounts")
    public void deleteAccount(@RequestParam("UserId") int userId)
    {
        accountService.deleteAccount(userId);
    }
}

