package com.example.Library.Management.System.controller;

import com.example.Library.Management.System.entity.Student;
import com.example.Library.Management.System.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;
    @PostMapping("/student/add/")
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    @GetMapping("/student/get/")
    public List<Student> getStudents() {
        return (List<Student>) studentService.getStudents();
    }
    @PutMapping("/stdudent/update/{id}")
    public void updateStudent(@PathVariable int id, @RequestBody Student student) {

        studentService.updateStudent(id,student);
    }
    @DeleteMapping("/student/delete/{id}")
    public void deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);

    }
}
