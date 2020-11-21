package team2.roommates.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import team2.roommates.models.Account;

public interface AccountRepository extends CrudRepository<Account, Integer> {

	@Query(value = "SELECT * FROM accounts where username=:username and password=:password", nativeQuery = true)
	List<Account> findAccountByUsernamePassword(
            @Param("username") String username,
            @Param("password") String password);
}
