package com.example.demo.user;


import jakarta.persistence.*;
import lombok.Data;

@Table(name="user_tb")
@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String email ;


}
