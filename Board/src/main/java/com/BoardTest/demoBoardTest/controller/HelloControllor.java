package com.BoardTest.demoBoardTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Scanner;


@Controller
public class HelloControllor {

    Scanner scan = new Scanner(System.in);

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
        // return은 html을 따름
        return "hello";
    }
    @RequestMapping("test")
    public String test(Model model){
        int value = 100;
        model.addAttribute("value",value);

        if (value == 100) {
            System.out.println("If");
            return "test";
        }else{
            System.out.println("Else");
            return "test2";
        }
    }

    @RequestMapping("test2")
    private void test2(){
        return;
    }
}
