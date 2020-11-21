package team2.roommates.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import team2.roommates.models.CommunityEvent;

import java.util.List;

public interface CommunityEventRepository extends CrudRepository<CommunityEvent, Integer> {
    @Query(value = "SELECT * FROM communityEvents where calendar_id=:calendarId", nativeQuery = true)
    List<CommunityEvent> getCommunityEventsByCalendarId(
            @Param("calendarId") int calendarId);
    @Query(value = "SELECT * FROM communityEvents where admin_id=:adminId", nativeQuery = true)
    List<CommunityEvent> getCommunityEventsByAdminId(
            @Param("adminId") int adminId);
}
