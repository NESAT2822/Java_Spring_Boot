package com.example.Library.Management.System.controller;

import com.example.Library.Management.System.entity.Admin;
import com.example.Library.Management.System.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class AdminController {
    private final AdminService adminService;
    @PostMapping("/admin/add/")
    public void addAdmin(@RequestBody Admin admin) {
        adminService.addAdmin(admin);
    }
    @GetMapping("/admin/get/")
    public List<Admin> getAllAdmins() {
        return (List<Admin>)adminService.getAllAdmins();

    }
    @PutMapping("/admin/update/{id}")
    public void updateAdmin(@PathVariable int id, @RequestBody Admin admin) {

        adminService.updateAdmin(id, admin);
    }
    @DeleteMapping("/admin/delete/{id}")
    public void deleteAdmin(@PathVariable int id) {
        adminService.deleteAdmin(id);

    }
}
