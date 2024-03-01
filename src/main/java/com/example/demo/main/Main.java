package com.example.demo.main;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Table(name="main_tb")
@Data
@Entity
public class Main {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String comName;
    private String comTitle;
    private String Location ;
    private String workingTime ;
    private String pay ;

    private LocalDate createdAt;

}
