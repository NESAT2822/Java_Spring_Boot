package com.example.Library.Management.System.entity;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Login {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;
    @OneToOne(cascade = CascadeType.PERSIST )
    @JoinColumn(name="admin_id")
    @JsonManagedReference
    private Admin admin;

}
