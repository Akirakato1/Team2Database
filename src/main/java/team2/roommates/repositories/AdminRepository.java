package team2.roommates.repositories;

import org.springframework.data.repository.CrudRepository;
import team2.roommates.models.Admin;

public interface AdminRepository extends CrudRepository<Admin, Integer> {
}
