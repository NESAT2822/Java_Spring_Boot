package com.example.Library.Management.System.repository;
import com.example.Library.Management.System.entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
