package team2.roommates.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team2.roommates.models.Invite;
import team2.roommates.repositories.InviteRepository;

import java.util.List;

@Service
public class InviteService {
    @Autowired
    InviteRepository inviteRepository;

    public Invite createInvite(Invite invite) {
        return inviteRepository.save(invite);
    }

    public Invite updateInvite(Invite invite) {
        return inviteRepository.save(invite);
    }

    public void deleteInvite(int inviteId) {
        inviteRepository.deleteById(inviteId);
    }

    public List<Invite> getInvitesForResident(int residentId) {
        return inviteRepository.getInvitesByResidentId(residentId);
    }
}
