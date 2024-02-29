package com.example.demo.main;


import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequiredArgsConstructor
@Controller
public class mainController {

    @GetMapping( "/")
    public String index () {

        return "index";
    }
    @GetMapping( "/board/detail")
    public String detail () {

        return "board/detail";
    }
}
