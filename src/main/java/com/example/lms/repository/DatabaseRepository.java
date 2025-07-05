package com.example.lms.repository;


import com.example.lms.entity.Admin_db;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DatabaseRepository extends JpaRepository<Admin_db, Integer>
{

}
