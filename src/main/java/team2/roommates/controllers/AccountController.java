package team2.roommates.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team2.roommates.models.Account;
import team2.roommates.services.AccountService;

@RestController
@CrossOrigin(origins = "*")
public class AccountController {
    @Autowired
    AccountService accountService;
    
    @GetMapping("/api/accounts")
    public List<Account> findAllAccounts(){
    	return accountService.findAllAccounts();
    }
    
    @GetMapping("/api/accounts/{username}/{password}")
    public Account findAccountByUsernamePassword(
    		@PathVariable String username,
    		@PathVariable String password){
    	return accountService.findAccountByUsernamePassword(username,password);
    }
    
    @PostMapping("/api/accounts")
    public Account createAccount(
            @RequestBody Account account
    ) {
        return accountService.createAccount(account);
    }

    @PutMapping("/api/accounts")
    public Account updateAccount(
            @RequestBody Account account
    ) {
        return accountService.updateAccount(account);
    }

    @DeleteMapping("/api/accounts/{accountId}")
    public void deleteAccount(
            @PathVariable int accountId
    ) {
    	accountService.deleteAccount(accountId);
    }
}
