package team2.roommates.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team2.roommates.models.Account;
import team2.roommates.repositories.AccountRepository;


@Service
public class AccountService {
    @Autowired
    AccountRepository accountRepository;

    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    public Account updateAccount(Account account) {
        return accountRepository.save(account);
    }

    public void deleteAccount(int accountId) {
    	accountRepository.deleteById(accountId);
    }

	public List<Account> findAllAccounts() {
		return (List<Account>) accountRepository.findAll();
	}
}
