package team2.roommates.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import team2.roommates.models.Group;

public interface GroupRepository extends CrudRepository<Group, Integer> {
    @Query(value = "SELECT * FROM groups where calendar_id=:calendarId", nativeQuery = true)
    Group getGroupByCalendarId(
            @Param("calendarId") int calendarId);
}
