package com.example.test_spring_scope_maemurasuzu.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.test_spring_scope_maemurasuzu.Form.UserForm;
import com.example.test_spring_scope_maemurasuzu.domain.User;

@Controller
@RequestMapping("/exam")
public class ExambonusController {
    @ModelAttribute
    public UserForm setupForm(){
        return new UserForm();
    }

    @RequestMapping("/bonus-input")
    public String index(){
        return "exam-bonus-input";
    }

    @RequestMapping("/bonus-input")
    public String result(UserForm form, String password, Model model){
        User user = new User();
        user.setName(form.getName());
        user.setEmail(form.getEmail());
        user.setAge(form.getAge());
        if("yamada@sample.com".equals(form.getEmail()) && "yamayama".equals(password)){
            model.addAttribute("message", "成功");
            model.addAttribute("user", user);
        }
        else{
            model.addAttribute("message", "失敗");
        }
        return "exam-bonus-result";

    }
}
