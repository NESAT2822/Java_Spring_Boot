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

public class Books {
 @Id
 @GeneratedValue(strategy= GenerationType.IDENTITY)

    private int id;
    private int pages;
    private String name;
    @ManyToOne(cascade = CascadeType.PERSIST )
    @JoinColumn(name="author_id")
    @JsonManagedReference
    private Author author;

    }
