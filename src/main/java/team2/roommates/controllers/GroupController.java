package team2.roommates.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team2.roommates.models.Group;
import team2.roommates.services.GroupService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class GroupController {
    @Autowired
    GroupService groupService;

    @PostMapping("/api/groups")
    public Group createGroup(
            @RequestBody Group group
    ) {
        return groupService.createGroup(group);
    }

    @PutMapping("/api/groups")
    public Group updateGroup(
            @RequestBody Group group
    ) {
        return groupService.updateGroup(group);
    }

    @DeleteMapping("/api/groups/{groupId}")
    public void deleteGroup(
            @PathVariable int groupId
    ) {
        groupService.deleteGroup(groupId);
    }

    @GetMapping("/api/calendars/{calendarId}/groups")
    public Group getGroupsByCalendarId(
            @PathVariable int calendarId
    ) {
        return groupService.getGroupByCalendarId(calendarId);
    }

    @GetMapping("/api/apartments/")
    public List<Group> getAllGroups()
    {
        return groupService.getAllGroups();
    }

    @GetMapping("/api/apartments/{apartmentId}")
    public Group getGroupById(
            @PathVariable int apartmentId
    )
    {
        return groupService.getGroupById(apartmentId);
    }
}
