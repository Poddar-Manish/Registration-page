package com.user.reg.controller;

import com.user.reg.entity.Emp;
import com.user.reg.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Usercontroller {

    @Autowired
    private Userservice userservice;


    @GetMapping("/")
    public String register(Model model) {
        Emp emp = new Emp();
        model.addAttribute("emp", emp);
        return "register";
    }

    @PostMapping("/registerUser")
    public String registerUser(@ModelAttribute("emp") Emp emp){
        System.out.println(emp);
        userservice.register(emp);
        return "home";
    }
}
