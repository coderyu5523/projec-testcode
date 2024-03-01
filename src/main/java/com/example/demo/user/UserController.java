package com.example.demo.user;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@RequiredArgsConstructor
@Controller
public class UserController {

    private final UserRepository userRepository ;
    @GetMapping("/user/profile")
    public String userProfile(HttpServletRequest request) {

        List<User> userList = userRepository.findAll();
        String requsetDTO1  = userList.get(0).getName();
        String requsetDTO2  = userList.get(0).getEmail();
        request.setAttribute("list1",requsetDTO1 );
        request.setAttribute("list2",requsetDTO2 );


        return "user/profile";
    }



}
