package team2.roommates.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import team2.roommates.models.Resident;

import java.util.List;

public interface ResidentRepository extends CrudRepository<Resident, Integer> {
    @Query(value = "SELECT * FROM residents where admin_id=:adminId", nativeQuery = true)
    List<Resident> getResidentsByAdminId(
            @Param("adminId") int adminId);
    @Query(value = "SELECT * FROM residents where calendar_id=:calendarId", nativeQuery = true)
    List<Resident> getResidentsByCalendarId(
            @Param("calendarId") int calendarId);
    @Query(value = "SELECT * FROM residents where group_id=:groupId", nativeQuery = true)
    List<Resident> getResidentsByGroupId(
            @Param("groupId") int groupId);
}
