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
public class Database {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String name;
    private String url;
 @OneToOne (cascade = CascadeType.PERSIST )
 @JoinColumn(name="admin_id")
 @JsonManagedReference
 private Admin admin;
}
