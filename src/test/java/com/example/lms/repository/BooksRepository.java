package com.example.Library.Management.System.repository;
import com.example.Library.Management.System.entity.Books;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Books, Integer>
{

}
