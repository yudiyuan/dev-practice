package com.example.supplier_demo.dao;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import static jakarta.persistence.GenerationType.IDENTITY;


@Entity
@Table(name="supplier")
public class Supplier {

    @Id
    //JPA（Java Persistence API）中的注解，用来标记主键字段
    @Column(name = "id")
    @GeneratedValue(strategy = IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "age")
    private int age;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
