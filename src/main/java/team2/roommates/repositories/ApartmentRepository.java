package team2.roommates.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import team2.roommates.models.Apartment;
import team2.roommates.models.Chore;

public interface ApartmentRepository extends CrudRepository<Apartment, Integer> {
	@Query(value = "SELECT * FROM apartments where admin_id=:id", nativeQuery = true)
    List<Apartment> getApartmentsByAdminId(
            @Param("id") int id);
}
