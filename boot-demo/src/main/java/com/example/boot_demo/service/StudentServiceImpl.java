package com.example.boot_demo.service;

import com.example.boot_demo.dao.Student;
import com.example.boot_demo.dao.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    //A Spring annotation that tells the framework to automatically inject the corresponding Bean here.
    private StudentRepository studentRepository;
    //Declares a private field whose type is the StudentRepository interface.
    //The field name (variable name); you can use it in this class to access database logic without manually creating an object with new.

    @Override
    public Student getStudentById(long id) {
        return studentRepository.findById(id).orElseThrow(RuntimeException::new);
    }
}
