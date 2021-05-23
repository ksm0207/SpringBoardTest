package com.BoardTest.demoBoardTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloControllor {

    @GetMapping
    public String Hello(Model model){
        int num  = 10;
        int num2 = 10;
        int result = num + num2;

        String name = "Kim";
        String gender =  "남";
        int age = 27;

        model.addAttribute("data","Hello Spring");
        model.addAttribute("Integer",result);
        model.addAttribute("name",name);
        model.addAttribute("gender",gender);
        model.addAttribute("age",age);
        return "hello";
    }
    @RequestMapping("test")
    private void test(){
        return;
    }

    @RequestMapping("test2")
    private void test2(){
        return;
    }
}
