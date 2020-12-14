package group2.tier2csep3.controllers;

import group2.tier2csep3.model.account.Account;
import group2.tier2csep3.service.accountService.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping("/login")
    public Account getMyAccount(@RequestBody Account account) {
        return accountService.validateAccount(account.getUsername(), account.getPassword());
    }

    @GetMapping("/register")
    public String register(@RequestBody Account account) {
        System.out.println(account);
        return accountService.register(account);
    }

    @GetMapping("/update")
    public String editAccount(@RequestBody Account account) {
        return accountService.editAccount(account);
    }

    @DeleteMapping("/delete/{userId}")
    public void deleteAccount(@PathVariable int userId) {
        accountService.deleteAccount(userId);
    }

    @GetMapping("/accounts")
    public Account getUserByUsername(@RequestParam("Username") String username) {
        return accountService.getUserByUsername(username);
    }

    @GetMapping("/accounts/{id}")
    public Account getUserById(@PathVariable int id) {
        return accountService.getUserById(id);
    }

    @GetMapping("/followedAccounts/{userId}")
    public List<Account> getFollowedAccounts(@PathVariable int userId) {
        return accountService.getFollowedAccounts(userId);
    }

    @PostMapping("/followAccount/{userId}")
    public void followAccount(@PathVariable int userId, @RequestBody int userToFollow) {
        accountService.followAccount(userId, userToFollow);
    }

    @PostMapping("/unfollowAccount/{userId}")
    public void unfollowAccount(@PathVariable int userId, @RequestBody int userToUnfollow) {
        accountService.unfollowAccount(userId, userToUnfollow);
    }
}

