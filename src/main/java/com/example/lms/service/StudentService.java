package com.example.lms.service;
import com.example.lms.entity.Student;
import com.example.lms.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;
    public void addStudent(Student student) {
        Student student1=new Student();
        student1.setId(student.getId());
        student1.setName(student.getName());
        student1.setAddress(student.getAddress());
        student1.setMobile_no(student.getMobile_no());
        student1.setBatch(student.getBatch());

        studentRepository.save(student1);
    }
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void updateStudent(int id,Student student){
        Student student2=new Student();
        student2.setId(student.getId());
        student2.setName(student.getName());
        studentRepository.save(student2);
    }
    public void deleteStudent(int id) {
        Student student3=studentRepository.findById(id).get();
        studentRepository.delete(student3);

    }
}
