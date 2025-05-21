package com.example.hellospring.model;

import jakarta.persistence.*;
@Entity


public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String course;

    //Constructors
    public Student(String name, String email, String course) {
        this.name = name;
        this.email = email;
        this.course = course;
    }
    
}
