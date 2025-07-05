package com.example.lms.controller;
import com.example.lms.entity.Faculty;
import com.example.lms.service.FacultyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class FacultyController {
    private final FacultyService facultyService;

    @PostMapping("/faculty/add")
    public void addFaculty(@RequestBody Faculty faculty) {
        facultyService.addFaculty(faculty);
    }

    @GetMapping("/faculty/get")
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
