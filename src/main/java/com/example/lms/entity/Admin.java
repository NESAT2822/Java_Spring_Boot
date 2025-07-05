package com.example.lms.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Admin {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
    private String subject;
    private String mobile_no;

    @OneToMany(mappedBy = "admin")
    @JsonManagedReference
    private List<Student> students;

    @OneToOne(mappedBy = "admin")
    @JsonBackReference
    private Login login;

    @OneToMany(mappedBy = "admin")
    @JsonManagedReference
    List<Books> books;

    @OneToOne
    @JoinColumn(name="database_id")
    @JsonBackReference
    private Admin_db database;

    }
