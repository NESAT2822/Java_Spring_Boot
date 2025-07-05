package com.example.lms.entity;
import com.fasterxml.jackson.annotation.JsonBackReference;
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
    @OneToOne
    @JoinColumn(name="admin_id")
    @JsonBackReference
    private Admin admin;
    @OneToOne
    @JoinColumn(name="permission_id")
    @JsonBackReference
    private Permission permission;

}
