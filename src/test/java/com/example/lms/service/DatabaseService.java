package com.example.Library.Management.System.service;

import com.example.Library.Management.System.entity.Database;
import com.example.Library.Management.System.repository.DatabaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class DatabaseService {
    private final DatabaseRepository databaseRepository;
    public void addDatabase(Database database) {
        Database database1=new Database();
        database1.setId(database.getId());
        database1.setName(database.getName());
        database1.setUrl(database.getUrl());
        databaseRepository.save(database1);

    }
    public List<Database> getAllDatabases() {

        return databaseRepository.findAll();
    }
    public void updateDatabase(int id,Database database) {
        Database database2= new Database();
        database2.setId(database2.getId());
        database2.setName(database.getName());
        database2.setUrl(database.getUrl());
        databaseRepository.save(database2);
    }
    public void deleteDatabase(int id) {

        Database database3= databaseRepository.findById(id).get();
    }
}
