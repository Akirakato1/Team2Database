package team2.roommates.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import team2.roommates.models.Event;

import java.util.List;

public interface EventRepository extends CrudRepository<Event, Integer> {
    @Query(value = "SELECT * FROM events where calendar_id=:calendarId", nativeQuery = true)
    List<Event> getUserEventsByCalendarId(
            @Param("calendarId") int calendarId);
}
