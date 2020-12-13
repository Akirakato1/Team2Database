package team2.roommates.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team2.roommates.models.Resident;
import team2.roommates.services.ResidentService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ResidentController {
    @Autowired
    ResidentService residentService;

    @GetMapping("/api/residents")
    public List<Resident> findAllResidents(){
    	return residentService.findAllResidents();
    }
   
    @PostMapping("/api/residents")
    public Resident createResident(
            @RequestBody Resident resident
    ) {
        return residentService.createResident(resident);
    }

    @PutMapping("/api/residents")
    public Resident updateResident(
            @RequestBody Resident resident
    ) {
        return residentService.updateResident(resident);
    }

    @DeleteMapping("/api/residents/{residentId}")
    public void deleteResident(
            @PathVariable int residentId
    ) {
        residentService.deleteResident(residentId);
    }

    @GetMapping("/api/admins/{adminId}/residents")
    public List<Resident> getResidentsByAdminId(
            @PathVariable int adminId
    ) {
        return residentService.getResidentsByAdminId(adminId);
    }

    @GetMapping("/api/calendars/{calendarId}/residents")
    public List<Resident> getResidentsByCalendarId(
            @PathVariable int calendarId
    ) {
        return residentService.getResidentsByCalendarId(calendarId);
    }

    @GetMapping("/api/apartments/{apartmentId}/residents")
    public List<Resident> getResidentsByApartmentId(
            @PathVariable int apartmentId
    ) {
        return residentService.getResidentsByApartmentId(apartmentId);
    }
}
