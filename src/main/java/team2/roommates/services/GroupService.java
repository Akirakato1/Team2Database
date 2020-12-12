package team2.roommates.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team2.roommates.models.Group;
import team2.roommates.repositories.GroupRepository;

import java.util.List;


@Service
public class GroupService {
    @Autowired
    GroupRepository groupRepository;

    public Group getGroupById(int id) { return groupRepository.findById(id).get(); }

    public List<Group> getAllGroups() { return (List<Group>) groupRepository.findAll(); }

    public Group createGroup(Group group) {
        return groupRepository.save(group);
    }

    public Group updateGroup(Group group) {
        return groupRepository.save(group);
    }

    public void deleteGroup(int groupId) {
        groupRepository.deleteById(groupId);
    }

    public Group getGroupByCalendarId(int calendarId) {
        return groupRepository.getGroupByCalendarId(calendarId);
    }
}
