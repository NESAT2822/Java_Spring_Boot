package com.example.lms.service;
import com.example.lms.entity.Admin;
import com.example.lms.repository.AdminRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class AdminService {
    private final AdminRepository adminRepository;

    public void addAdmin(Admin admin) {
        Admin admin1 = new Admin();
        admin1.setName(admin.getName());
        admin1.setId(admin.getId());
        admin1.setAddress(admin1.getAddress());
        admin1.setSubject(admin1.getSubject());
        admin1.setMobile_no(admin1.getMobile_no());
        adminRepository.save(admin1);

    }

    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    public void updateAdmin(int id,Admin admin) {
        Admin admin2 = new Admin();
        admin2.setName(admin.getName());
        admin2.setId(admin.getId());
        admin2.setAddress(admin.getAddress());
        admin2.setSubject(admin.getSubject());
        admin2.setMobile_no(admin.getMobile_no());
        adminRepository.save(admin2);

    }
    public void deleteAdmin(int id) {
        Admin admin3=adminRepository.findById(id).get();
        adminRepository.delete(admin3);
    }
}
