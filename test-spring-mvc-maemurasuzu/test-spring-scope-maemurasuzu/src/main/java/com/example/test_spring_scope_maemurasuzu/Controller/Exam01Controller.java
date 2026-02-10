package com.example.test_spring_scope_maemurasuzu.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/exam01")
public class Exam01Controller {

    @RequestMapping("")
    public String index(){
        return "exam01";
    }

    @RequestMapping("/result")
    public String result(String email, String password, Model model){
        if("yamada@sample.com".equals(email) && "yamayama".equals(password)){
            model.addAttribute("message", "成功");
        }
        else{
            model.addAttribute("message", "失敗");
        }
        return "exam01-result";

    }
    
}
