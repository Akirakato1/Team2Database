package team2.roommates.services;

import java.util.List;

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

	public List<Admin> findAllAdmins() {
		return (List<Admin>) adminRepository.findAll();
	}

	public Admin getAdminById(int id) {
		return adminRepository.findById(id).get();
	}
}
