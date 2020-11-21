package team2.roommates.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team2.roommates.models.CommunityEvent;
import team2.roommates.repositories.CommunityEventRepository;

import java.util.List;

@Service
public class CommunityEventService {
    @Autowired
    CommunityEventRepository communityEventRepository;

    public CommunityEvent createCommunityEvent(CommunityEvent communityEvent) {
        return communityEventRepository.save(communityEvent);
    }

    public CommunityEvent updateCommunityEvent(CommunityEvent communityEvent) {
        return communityEventRepository.save(communityEvent);
    }

    public void deleteCommunityEvent(int communityEventId) {
        communityEventRepository.deleteById(communityEventId);
    }

    public List<CommunityEvent> getCommunityEventsByCalendarId(int calendarId) {
        return communityEventRepository.getCommunityEventsByCalendarId(calendarId);
    }

    public List<CommunityEvent> getCommunityEventsByAdminId(int adminId) {
        return communityEventRepository.getCommunityEventsByAdminId(adminId);
    }
}
