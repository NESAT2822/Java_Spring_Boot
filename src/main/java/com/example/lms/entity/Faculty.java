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

public class Faculty {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String facultyName;
    private String facultyAddress;
    private  int faculty_batch;
    @ManyToMany(mappedBy = "faculties")
    @JsonManagedReference
    private List<Student> students;



}