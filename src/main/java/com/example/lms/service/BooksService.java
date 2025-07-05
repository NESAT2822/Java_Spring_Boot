package com.example.lms.service;


import com.example.lms.entity.Books;
import com.example.lms.repository.BooksRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class BooksService {
    private final BooksRepository booksRepository;
    public void addBooks(Books books) {
        Books books1 = new Books();
        books1.setId(books.getId());
        books1.setPages(books.getPages());
        books1.setName(books.getName());
        booksRepository.save(books1);

    }
    public List<Books> getAllBookes() {
        return booksRepository.findAll();
    }
    public void updateBooks(int id, Books books) {
        Books books2= new Books();
        books2.setId(books.getId());
        books2.setPages(books.getPages());
        books2.setName(books.getName());
        booksRepository.save(books2);
    }
    public void deleteBooks(int id) {
            Books books3 = booksRepository.findById(id).get();
        booksRepository.delete(books3);
        }
    }

