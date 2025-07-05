package com.example.Library.Management.System.service;

import com.example.Library.Management.System.entity.Faculty;
import com.example.Library.Management.System.repository.FacultyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class FacultyService {
    private final FacultyRepository facultyRepository;
    public void addFaculty(Faculty faculty) {
        Faculty faculty1=new Faculty();
        faculty1.setId(faculty1.getId());
        faculty1.setFacultyName(faculty.getFacultyName());
        faculty1.setFacultyAddress(faculty.getFacultyAddress());
        faculty1.setFaculty_batch(faculty.getFaculty_batch());
        facultyRepository.save(faculty1);

    }
    public List<Faculty> getAllFaculty() {
        return facultyRepository.findAll();

    }
    public void updateFaculty(int id,Faculty faculty) {
        Faculty faculty2=new Faculty();
        faculty2.setId(faculty.getId());
        faculty2.setFacultyName(faculty.getFacultyName());
        faculty2.setFacultyAddress(faculty.getFacultyAddress());
        faculty2.setFaculty_batch(faculty.getFaculty_batch());
        facultyRepository.save(faculty2);
    }
    public void deleteFaculty(int id) {
        Faculty faculty3=facultyRepository.findById(id).get();
        facultyRepository.delete(faculty3);
    }

}
