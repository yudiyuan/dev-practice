package com.example.boot_demo.dao;


import jakarta.persistence.*;

@Entity
//@Entity is an annotation used to tell JPA that the class is an "entity" and corresponds to a table in the database.

@Table(name="student")
//Optional: specifies the corresponding table name.

public class Student {

    @Id
    //Indicates the primary key
    @Column(name="id")
    //This uses JPA (Java Persistence API) annotations to map the fields to the database table.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@GeneratedValue: Specifies the strategy for generating primary key values.
    //strategy: Specifies the strategy to use.
    //GenerationType.IDENTITY: Uses the database's auto-increment feature to generate primary key values.
    private long id;
    //We use JPA annotations to map class fields to database columns.

    @Column(name="name")
    private String name;

    @Column(name="email")
    private String email;

    @Column(name="age")
    private int age;

}
