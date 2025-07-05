package com.example.lms.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Books {
 @Id
 @GeneratedValue(strategy= GenerationType.IDENTITY)

    private int id;
    private int pages;
    private String name;
    @ManyToOne
    @JoinColumn(name="author_id")
    @JsonBackReference
    private Author author;

    @ManyToOne
    @JoinColumn(name="admin_id")
    @JsonBackReference
    private Admin admin;

    }
