package team2.roommates.repositories;

import org.springframework.data.repository.CrudRepository;
import team2.roommates.models.Account;

public interface AccountRepository extends CrudRepository<Account, Integer> {
}
