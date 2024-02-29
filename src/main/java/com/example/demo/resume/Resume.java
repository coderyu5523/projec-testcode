package com.example.demo.resume;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Table(name="resume_tb")
@Data
@Entity

public class Resume {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer writerId ;
    private String title ;
    private String selfIntroduction;
    private String sName;
    private String major ;
    private String gradType ;
    private String gradDate ;
    private String comName ;
    private String career ;

    private LocalDateTime createdAt;

}
