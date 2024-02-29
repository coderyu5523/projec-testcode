package com.example.demo.main;


import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class MainController {

    private final MainRepository mainRepository ;

    @GetMapping( "/")
    public String index (HttpServletRequest request) {

      List<Main> mainList = mainRepository.findAll();
      request.setAttribute("mainList",mainList);

        return "index";
    }
    @GetMapping( "/board/listings")
    public String detail (HttpServletRequest request) {
        List<Main> mainList = mainRepository.findAll();
        request.setAttribute("mainList",mainList);

        return "board/listings";
    }


}
