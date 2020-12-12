package team2.roommates.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import team2.roommates.models.RSVP;
import team2.roommates.models.RSVPId;

import java.util.List;

public interface RSVPRepository extends CrudRepository<RSVP, RSVPId> {
    @Query(value = "SELECT * FROM rsvps where apartment_id=:apartmentId", nativeQuery = true)
    List<RSVP> getRSVPSByApartmentId(
            @Param("apartmentId") int apartmentId
    );

    @Query(value = "SELECT * FROM rsvps where event_id=:eventId", nativeQuery = true)
    List<RSVP> getRSVPSByEventId(
            @Param("eventId") int eventId
    );
}
