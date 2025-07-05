package com.example.Library.Management.System.controller;

import com.example.Library.Management.System.entity.Database;
import com.example.Library.Management.System.service.DatabaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class DatabaseController {
    private final DatabaseService databaseService;
    @PostMapping("/database/add/")
    public void addDatabase(@RequestBody Database database) {
        databaseService.addDatabase(database);
    }
    @GetMapping("/database/get/")
    public List<Database> getDatabases() {
        return  (List<Database>)databaseService.getAllDatabases();
    }

    @PutMapping("/database/update/{id}")
    public void updateDatabase(@PathVariable int id, @RequestBody Database database) {

        databaseService.updateDatabase(id,database);
    }
   @DeleteMapping("/database/delete/{id}")
   public void deletedatabse(@PathVariable int id) {
        databaseService.deleteDatabase(id);

    }
}

