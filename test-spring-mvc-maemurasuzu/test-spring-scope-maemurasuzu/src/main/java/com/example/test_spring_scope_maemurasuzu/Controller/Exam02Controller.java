package com.example.test_spring_scope_maemurasuzu.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {
    @Autowired
    private HttpSession session;

    @RequestMapping("")
    public String index(){
        return "exam02";
    }

    @RequestMapping("/result")
    public String calc(Integer num1, Integer num2){
        Integer result = num1 + num2;
        session.setAttribute("num1", num1);
        session.setAttribute("num2", num2);
        session.setAttribute("result", result);
        return "exam02-result";
    }

    @RequestMapping("/result2")
    public String calc2(){
        return "exam02-result2";
    }

}
