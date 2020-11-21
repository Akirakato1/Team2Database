package team2.roommates.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import team2.roommates.models.Invite;

import java.util.List;

public interface InviteRepository extends CrudRepository<Invite, Integer> {
    @Query(value = "SELECT * FROM invites where resident_id=:residentId", nativeQuery = true)
    List<Invite> getInvitesByResidentId(
            @Param("residentId") int residentId);
}
