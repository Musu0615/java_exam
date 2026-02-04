package com.example.test_spring_mvc_maemurasuzu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.test_spring_mvc_maemurasuzu.form.ReceiveNameForm;

@Controller
@RequestMapping("/name")
public class RecieveNameController {
    @ModelAttribute
    public ReceiveNameForm setupForm(){
        return new ReceiveNameForm();
    }

    @RequestMapping("")
    public String index(){
        return "name-form";
    }

    @RequestMapping("/receive1")
    public String receive1(String name){
        System.out.println(name);
        return "finished";
    }

    @RequestMapping("/receive2")
    public String receive2(ReceiveNameForm form){
        System.out.println(form.getName());
        return "finished";
    }

}
