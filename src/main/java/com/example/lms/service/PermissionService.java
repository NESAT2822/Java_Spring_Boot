package com.example.lms.service;
import com.example.lms.entity.Permission;
import com.example.lms.repository.PermissionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class PermissionService {
    private final PermissionRepository permissionRepository;

    public void  addPermission(Permission permission) {
        Permission permission1=new Permission();
        permission1.setId(permission.getId());
        permission1.setName(permission.getName());
        permissionRepository.save(permission1);
    }
    public List<Permission> getPermissions() {
        return permissionRepository.findAll();
    }
    public void updatePermission(int id,Permission permission) {
        Permission permission2=new Permission();
        permission2.setId(permission.getId());
        permission2.setName(permission.getName());
        permissionRepository.save(permission2);

    }
    public void deletePermission(int id) {
        Permission permission3=permissionRepository.findById(id).get();
        permissionRepository.delete(permission3);


    }
}
