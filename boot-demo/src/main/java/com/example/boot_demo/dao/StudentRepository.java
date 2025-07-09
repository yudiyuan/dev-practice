package com.example.boot_demo.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//It is a Spring annotation that indicates the class is a data access layer component, and allows Spring to automatically register it into the dependency injection container.

public interface StudentRepository extends JpaRepository<Student,Long> {
    List<Student> findByEmail(String email);
//This is a Spring Data JPA interface declaration, where the angle brackets <Student, Long> use Java Generics syntax.
//This is a repository interface for the Student entity class, with the primary key type being Long.
    //This parent interface contains many default implementations and encapsulates common CRUD operations.
}
