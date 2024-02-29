package com.example.demo.user;


import lombok.Data;

public class UserResponse {
    @Data
    public static class detailDTO{
        private String username;
        private String email;

    }

}
