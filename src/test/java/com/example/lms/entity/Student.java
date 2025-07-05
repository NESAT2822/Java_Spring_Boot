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

public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
    private String mobile_no;
    private int batch ;
    @ManyToOne(cascade = CascadeType.PERSIST )
    @JoinColumn(name="author_id")
    @JsonManagedReference
    private Admin admin;

}
