package team2.roommates.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import team2.roommates.models.Chore;

import java.util.List;

public interface ChoreRepository extends CrudRepository<Chore, Integer> {
    @Query(value = "SELECT * FROM chores where apartment_id=:apartmentId", nativeQuery = true)
    List<Chore> getChoresByApartmentId(
            @Param("apartmentId") int apartmentId);
}
