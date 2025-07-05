package com.example.Library.Management.System.service;
import com.example.Library.Management.System.entity.Author;
import com.example.Library.Management.System.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class AuthorService {
    private final AuthorRepository authorRepository;
    public void addAuthor(Author author) {
        Author author1= new Author();
        author1.setId(author.getId());
        author1.setName(author.getName());
        author1.setAddress(author.getAddress());
        author1.setMobile_no(author.getMobile_no());
        author1.setSubject(author.getSubject());
        authorRepository.save(author1);


    }
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }
    public void updateAuthor(int id,Author author) {
        Author author2 = new Author();
        author2.setId(author.getId());
        author2.setName(author.getName());
        author2.setAddress(author.getAddress());
        author2.setMobile_no(author.getMobile_no());
        author2.setSubject(author.getSubject());
        authorRepository.save(author2);
    }
    public void deleteAuthor(int id) {
        Author author3=authorRepository.findById(id).get();
        authorRepository.delete(author3);
    }


}
