package com.example.Library.Management.System.controller;

import com.example.Library.Management.System.entity.Faculty;
import com.example.Library.Management.System.service.FacultyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class FacultyController {
    private final FacultyService facultyService;

    @PostMapping("/faculty/add/")
    public void addFaculty(@RequestBody Faculty faculty) {
        facultyService.addFaculty(faculty);
    }

    @GetMapping("/faculty/get/")
    public List<Faculty> getAllFacultys() {
        return (List<Faculty>)facultyService.getAllFaculty();

    }

    @PutMapping("/faculty/update/{id}")
    public void updateFaculty(@PathVariable int id, @RequestBody Faculty faculty) {

        facultyService.updateFaculty(id, faculty);
    }

    @DeleteMapping("/faculty/delete/{id}")
    public void deletefaculty(@PathVariable int id) {
        facultyService.deleteFaculty(id);

    }
}
