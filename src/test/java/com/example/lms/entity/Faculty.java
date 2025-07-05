package com.example.Library.Management.System.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    @ManyToOne(cascade = CascadeType.PERSIST )
    @JoinColumn(name="student_id")
    @JsonManagedReference
    private Student student;


}