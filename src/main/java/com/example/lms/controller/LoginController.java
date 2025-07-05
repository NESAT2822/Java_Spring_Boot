package com.example.lms.controller;

import com.example.lms.entity.Login;
import com.example.lms.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class LoginController {
    private final LoginService loginService;
    @PostMapping("/login/add/")
    public void addLogin(@RequestBody Login login) {
        loginService.addLogin(login);
    }
    @GetMapping("/login/get/")
    public List<Login> getLogins() {
        return (List<Login>)loginService.getALogins();

    }
    @PutMapping("login/update/{id}")
    public void updateLogin(@PathVariable int id,@RequestBody Login login) {

        loginService.UpdateLogin(id,login);
    }
    @DeleteMapping("/login/delete/{id}")
    public void deleteLogin(@PathVariable int id) {
        loginService.DeleteLogin(id);
    }

}
