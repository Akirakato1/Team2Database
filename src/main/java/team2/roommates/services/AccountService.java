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

	public Account findAccountByUsernamePassword(String username, String password) {
		List<Account> al=accountRepository.findAccountByUsernamePassword(username,password);
		if(al.size()==0) {
			return null;
		}
		else {
			return al.get(0);
		}
	}
}
