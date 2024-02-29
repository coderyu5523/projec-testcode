package com.example.demo.main;

import jakarta.persistence.*;
import lombok.Data;

@Table(name="main_tb")
@Data
@Entity
public class Main {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String comName;
    private String comTitle;

}
