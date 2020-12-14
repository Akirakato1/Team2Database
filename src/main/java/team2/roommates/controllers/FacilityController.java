package team2.roommates.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team2.roommates.models.Facility;
import team2.roommates.services.FacilityService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class FacilityController {
    @Autowired
    FacilityService facilityService;

    @PostMapping("/api/facilities")
    public Facility createFacility(
            @RequestBody Facility facility
    ) {
        return facilityService.createFacility(facility);
    }

    @PutMapping("/api/facilities")
    public Facility updateFacility(
            @RequestBody Facility facility
    ) {
        return facilityService.updateFacility(facility);
    }

    @DeleteMapping("/api/facilities/{facilityId}")
    public void deleteFacility(
            @PathVariable int facilityId
    ) {
        facilityService.deleteFacility(facilityId);
    }

    @GetMapping("/api/admins/{adminId}/facilities")
    public List<Facility> getFacilitiesByAdminId(
            @PathVariable int adminId
    ) {
        return facilityService.getFacilitiesByAdminId(adminId);
    }

    @GetMapping("/api/facilities")
    public List<Facility> getAllFacilities()
    {
        return facilityService.getAllFacilities();
    }

    @GetMapping("/api/facilities/{id}")
    public Facility getFacilityById(
            @PathVariable int id
    ) {
        return facilityService.getFacilityById(id);
    }
}
