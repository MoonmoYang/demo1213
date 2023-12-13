package com.example.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "USER_ID")
    private String id;

    @Column( name = "USER_PASSWORD")
    private String password;

    @Column( name = "USER_NAME")
    private String USER_NAME;



}
