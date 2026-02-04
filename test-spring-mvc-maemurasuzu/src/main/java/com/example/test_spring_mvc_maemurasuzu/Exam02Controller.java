package com.example.test_spring_mvc_maemurasuzu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {
    @RequestMapping("/show-company-introduction")
    public String showCompanyIntroduction(){
        return "redirect:/exam02/introduction2";
    }

    @RequestMapping("/introduction2")
    public String showCompanyIntroduction2(){
        return "exam-02";
    }
}
