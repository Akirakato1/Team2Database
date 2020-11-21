package team2.roommates.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team2.roommates.models.Facility;
import team2.roommates.repositories.FacilityRepository;

import java.util.List;

@Service
public class FacilityService {
    @Autowired
    FacilityRepository facilityRepository;

    public Facility createFacility(Facility facility) {
        return facilityRepository.save(facility);
    }

    public Facility updateFacility(Facility facility) {
        return facilityRepository.save(facility);
    }

    public void deleteFacility(int facilityId) {
        facilityRepository.deleteById(facilityId);
    }

    public List<Facility> getFacilitiesByAdminId(int adminId) {
        return facilityRepository.getFacilitiesByAdminId(adminId);
    }
}
