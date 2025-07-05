package com.example.lms.controller;


import com.example.lms.entity.Admin_db;
import com.example.lms.service.DatabaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class DatabaseController {
    private final DatabaseService databaseService;
    @PostMapping("/database/add/")
    public void addDatabase(@RequestBody Admin_db database) {
        databaseService.addDatabase(database);
    }
    @GetMapping("/database/get/")
    public List<Admin_db> getDatabases() {
        return  (List<Admin_db>)databaseService.getAllDatabases();
    }

    @PutMapping("/database/update/{id}")
    public void updateDatabase(@PathVariable int id, @RequestBody Admin_db database) {

        databaseService.updateDatabase(id,database);
    }
   @DeleteMapping("/database/delete/{id}")
   public void deletedatabse(@PathVariable int id) {
        databaseService.deleteDatabase(id);

    }
}

