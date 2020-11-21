package team2.roommates.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team2.roommates.models.Group;
import team2.roommates.repositories.GroupRepository;


@Service
public class GroupService {
    @Autowired
    GroupRepository groupRepository;

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
