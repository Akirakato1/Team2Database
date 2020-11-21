package team2.roommates.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team2.roommates.models.Resident;
import team2.roommates.repositories.ResidentRepository;

import java.util.List;

@Service
public class ResidentService {
    @Autowired
    ResidentRepository residentRepository;

    public Resident createResident(Resident resident) {
        return residentRepository.save(resident);
    }

    public Resident updateResident(Resident resident) {
        return residentRepository.save(resident);
    }

    public void deleteResident(int residentId) {
        residentRepository.deleteById(residentId);
    }

    public List<Resident> getResidentsByAdminId(int adminId) {
        return residentRepository.getResidentsByAdminId(adminId);
    }

    public List<Resident> getResidentsByCalendarId(int calendarId) {
        return residentRepository.getResidentsByCalendarId(calendarId);
    }

    public List<Resident> getResidentsByGroupId(int groupId) {
        return residentRepository.getResidentsByGroupId(groupId);
    }
}
