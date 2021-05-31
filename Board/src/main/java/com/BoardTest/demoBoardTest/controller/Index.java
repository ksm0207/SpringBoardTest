package com.BoardTest.demoBoardTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class Index {

    @RequestMapping("/index")
    private String Hello(){
        return "index";
    }
}

