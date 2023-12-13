package com.example.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class MainCategory {

    @Id
    @GeneratedValue
    @Column( name = "MAINCATEGORY_ID")
    private Long MainCategory_Id;


    @Column( name = "MAINCATEGORY_NAME")
    private String name;



}
