package team2.roommates.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team2.roommates.models.CommunityEvent;
import team2.roommates.services.CommunityEventService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class CommunityEventController {
    @Autowired
    CommunityEventService communityEventService;

    @PostMapping("/api/communityEvents")
    public CommunityEvent createCommunityEvent(
            @RequestBody CommunityEvent communityEvent
    ) {
        return communityEventService.createCommunityEvent(communityEvent);
    }

    @PutMapping("/api/communityEvents")
    public CommunityEvent updateCommunityEvent(
            @RequestBody CommunityEvent communityEvent
    ) {
        return communityEventService.updateCommunityEvent(communityEvent);
    }

    @DeleteMapping("/api/communityEvents/{communityEventId}")
    public void deleteCommunityEvent(
            @PathVariable int communityEventId
    ) {
        communityEventService.deleteCommunityEvent(communityEventId);
    }

    @GetMapping("/api/calendars/{calendarId}/communityEvents")
    public List<CommunityEvent> getCommunityEventsByCalendarId(
            @PathVariable int calendarId
    ) {
        return communityEventService.getCommunityEventsByCalendarId(calendarId);
    }

    @GetMapping("/api/admins/{adminId}/communityEvents")
    public List<CommunityEvent> getCommunityEventsByAdminId(
            @PathVariable int adminId
    ) {
        return communityEventService.getCommunityEventsByAdminId(adminId);
    }
}
