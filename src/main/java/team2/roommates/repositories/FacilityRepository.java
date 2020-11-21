package team2.roommates.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import team2.roommates.models.Facility;

import java.util.List;

public interface FacilityRepository extends CrudRepository<Facility, Integer> {
    @Query(value = "SELECT * FROM facilities where admin_id=:adminId", nativeQuery = true)
    List<Facility> getFacilitiesByAdminId(
            @Param("adminId") int adminId);
}
