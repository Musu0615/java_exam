package com.example.test_spring_thymeleaf_maemurasuzu.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.test_spring_thymeleaf_maemurasuzu.domain.Member;

@Controller
@RequestMapping("/ex01")
public class ExamThymeleafController {
    @RequestMapping("")
    public String index(){
        return "ex-thymeleaf-input";
    }

    @RequestMapping("/input")
    public String result(Member members, Model model){
        model.addAttribute("members", members);
        return "ex-thymeleaf-result";

    }
}
