package com.example.lms.service;
import com.example.lms.entity.Login;
import com.example.lms.repository.LoginRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class LoginService {
    private final LoginRepository loginRepository;
    public void addLogin(Login login) {
        Login login1=new Login();
        login1.setId(login.getId());
        login1.setUsername(login.getUsername());
        login1.setPassword(login.getPassword());
        loginRepository.save(login1);
    }
    public List<Login>getALogins() {
        return loginRepository.findAll();

    }
    public void UpdateLogin(int id,Login login) {
        Login login2=new Login();
        login2.setId(login.getId());
        login2.setUsername(login.getUsername());
        login2.setPassword(login.getPassword());
        loginRepository.save(login2);
    }
    public void DeleteLogin(int id) {

        Login login3=loginRepository.findById(id).get();
        loginRepository.delete(login3);
    }
    }

