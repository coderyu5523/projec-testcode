package com.example.demo.resume;


import lombok.AllArgsConstructor;
import lombok.Data;

public class ResumeResponse {

    //select r.title,r.career, u.id,u.name from resume_tb r inner join user_tb u on r.u_id = u.id

    @Data
    public static class detailDTO{
        private String title;
        private String career;
        private Integer id;
        private String name ;

    }

}
