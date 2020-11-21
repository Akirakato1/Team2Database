package team2.roommates.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team2.roommates.models.Admin;
import team2.roommates.repositories.AdminRepository;


@Service
public class AdminService {
    @Autowired
    AdminRepository adminRepository;

    public Admin createAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    public Admin updateAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    public void deleteAdmin(int adminId) {
        adminRepository.deleteById(adminId);
    }
}
