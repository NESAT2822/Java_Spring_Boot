package com.example.lms.repository;


import com.example.lms.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Books, Integer>
{

}
