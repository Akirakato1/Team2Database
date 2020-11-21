package team2.roommates.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import team2.roommates.models.UserEvent;

import java.util.List;

public interface UserEventRepository extends CrudRepository<UserEvent, Integer> {
    @Query(value = "SELECT * FROM userEvents where calendar_id=:calendarId", nativeQuery = true)
    List<UserEvent> getUserEventsByCalendarId(
            @Param("calendarId") int calendarId);
}
