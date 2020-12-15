package team2.roommates.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team2.roommates.models.Account;
import team2.roommates.services.AccountService;

import javax.servlet.http.HttpSession;

@RestController
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders ="*")
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
            @PathVariable String password,
            HttpSession session){
        session.setAttribute("username", username);
        session.setAttribute("password", password);
    	return accountService.findAccountByUsernamePassword(username,password);
    }

    @GetMapping("/api/cookie")
    public Account findAccountByCookie(
            HttpSession session
    ) {
        if (session.getAttribute("username") == null) {
            return new Account();
        }
        String username = (String) session.getAttribute("username");
        String password = (String) session.getAttribute("password");
        return accountService.findAccountByUsernamePassword(username,password);
    }

    @GetMapping("/api/logout")
    public void logout(
            HttpSession session
    ) {
        session.invalidate();
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
