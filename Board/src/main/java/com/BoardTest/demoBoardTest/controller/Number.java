package com.BoardTest.demoBoardTest.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Number {

    @RequestMapping("/num")
    public String Num(Model model){
        int num = 10;

        model.addAttribute("numKey",num);

        return "num";
    }

}
