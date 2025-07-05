package com.example.lms.service;

import com.example.lms.entity.Admin_db;
import com.example.lms.repository.DatabaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class DatabaseService {
    private final DatabaseRepository databaseRepository;
    public void addDatabase(Admin_db database) {
        Admin_db database1=new Admin_db();
        database1.setId(database.getId());
        database1.setName(database.getName());
        database1.setUrl(database.getUrl());
        databaseRepository.save(database1);

    }
    public List<Admin_db> getAllDatabases() {

        return databaseRepository.findAll();
    }
    public void updateDatabase(int id,Admin_db database) {
        Admin_db database2= new Admin_db();
        database2.setId(database2.getId());
        database2.setName(database.getName());
        database2.setUrl(database.getUrl());
        databaseRepository.save(database2);
    }
    public void deleteDatabase(int id) {

        Admin_db database3= databaseRepository.findById(id).get();
    }
}
