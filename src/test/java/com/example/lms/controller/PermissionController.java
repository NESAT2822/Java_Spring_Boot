package com.example.Library.Management.System.controller;

import com.example.Library.Management.System.entity.Permission;
import com.example.Library.Management.System.service.PermissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PermissionController {
    private final PermissionService permissionService;
    @PostMapping("/permission/add/")
    public void addPermission(@RequestBody Permission permission) {

        permissionService.addPermission(permission);
      }
    @GetMapping("/permission/get/")
    public List<Permission> getPermissions() {

        return (List<Permission>) permissionService.getPermissions();
    }
    @PutMapping("/permission/update/{id}")
    public void updatePermission(@RequestBody Permission permission) {
        permissionService.updatePermission(permission.getId(), permission);

    }
    @DeleteMapping("/permission/delete/{id}")
    public Void deletePermission(@PathVariable int id) {
        permissionService.deletePermission(id);
        return null;

    }

}
