package com.example.Library.Management.System.controller;
import com.example.Library.Management.System.entity.Books;
import com.example.Library.Management.System.service.BooksService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class BooksController {
     private final BooksService booksService;
    @PostMapping("/books/add/")
    public void addBooks(@RequestBody Books books) {
        booksService.addBooks(books);
    }
    @GetMapping("/books/get/")
    public List<Books> getBooks () {
        return (List<Books>)booksService.getAllBookes();

    }
    @PutMapping("/books/update/{id}")
    public void updateBooks(@PathVariable int id, @RequestBody Books books) {

        booksService.updateBooks(id,books);
    }
    @DeleteMapping("/books/delete/{id}")
    public void deleteBooks(@PathVariable int id) {
        booksService.deleteBooks(id);

    }
}
