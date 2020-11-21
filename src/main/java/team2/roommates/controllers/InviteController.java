package team2.roommates.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team2.roommates.models.Invite;
import team2.roommates.services.InviteService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class InviteController {
    @Autowired
    InviteService inviteService;

    @PostMapping("/api/invites")
    public Invite createInvite(
            @RequestBody Invite invite
    ) {
        return inviteService.createInvite(invite);
    }

    @PutMapping("/api/invites")
    public Invite updateInvite(
            @RequestBody Invite invite
    ) {
        return inviteService.updateInvite(invite);
    }

    @DeleteMapping("/api/invites/{inviteId}")
    public void deleteInvite(
            @PathVariable int inviteId
    ) {
        inviteService.deleteInvite(inviteId);
    }

    @GetMapping("/api/residents/{residentId}/invites")
    public List<Invite> getInvitesByResidentId(
            @PathVariable int residentId
    ) {
        return inviteService.getInvitesForResident(residentId);
    }
}
