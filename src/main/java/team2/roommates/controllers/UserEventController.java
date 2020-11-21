package team2.roommates.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team2.roommates.models.UserEvent;
import team2.roommates.services.UserEventService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class UserEventController {
    @Autowired
    UserEventService userEventService;

    @PostMapping("/api/userEvents")
    public UserEvent createUserEvent(
            @RequestBody UserEvent userEvent
    ) {
        return userEventService.createUserEvent(userEvent);
    }

    @PutMapping("/api/userEvents")
    public UserEvent updateUserEvent(
            @RequestBody UserEvent userEvent
    ) {
        return userEventService.updateUserEvent(userEvent);
    }

    @DeleteMapping("/api/userEvents/{userEventId}")
    public void deleteUserEvent(
            @PathVariable int userEventId
    ) {
        userEventService.deleteUserEvent(userEventId);
    }

    @GetMapping("/api/calendars/{calendarId}/userEvents")
    public List<UserEvent> getUserEventsByCalendarId(
            @PathVariable int calendarId
    ) {
        return userEventService.getUserEventsByCalendarId(calendarId);
    }
}
