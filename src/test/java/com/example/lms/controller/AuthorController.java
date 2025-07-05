package com.example.Library.Management.System.controller;
import com.example.Library.Management.System.entity.Author;
import com.example.Library.Management.System.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class AuthorController {
    private final AuthorService authorService;
    @PostMapping("/author/add/")
    public void addAuthor(@RequestBody Author author) {
        authorService.addAuthor(author);
    }
    @GetMapping("/author/get/")
    public List<Author> getAuthor () {
        return (List<Author>)authorService.getAllAuthors();

    }
    @PutMapping("/author/update/{id}")
    public void updateAuthor(@PathVariable int id, @RequestBody Author author) {

        authorService.updateAuthor(id,author);
    }
    @DeleteMapping("/books/delete/{id}")
    public void deleteAuthor(@PathVariable int id) {
        authorService.deleteAuthor(id);

    }

}
