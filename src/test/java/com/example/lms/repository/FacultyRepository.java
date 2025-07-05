package com.example.Library.Management.System.repository;

import com.example.Library.Management.System.entity.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface FacultyRepository extends JpaRepository<Faculty, Integer>{


}
