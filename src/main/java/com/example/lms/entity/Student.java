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

public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
    private String mobile_no;
    private int batch ;
    @ManyToOne
    @JoinColumn(name="admin_id")
    private Admin admin;

    @ManyToMany
    @JoinTable(
            name="student_faculty",
            joinColumns=@JoinColumn(name="student_id"),
            inverseJoinColumns=@JoinColumn(name="faculty_id"))
    @JsonBackReference
    private List<Faculty> faculties;


}
