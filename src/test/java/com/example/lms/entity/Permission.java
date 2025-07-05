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

public class Permission {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToOne(cascade = CascadeType.PERSIST )
    @JoinColumn(name="login_id")
    @JsonManagedReference
    private Login login;
}
