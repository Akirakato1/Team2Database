package team2.roommates.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import team2.roommates.models.Reminder;

import java.util.List;

public interface ReminderRepository extends CrudRepository<Reminder, Integer> {
    @Query(value = "SELECT * FROM reminders where resident_id=:residentId", nativeQuery = true)
    List<Reminder> getRemindersByResidentId(
            @Param("residentId") int residentId);
}
