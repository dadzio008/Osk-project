package com.project.oskapi.controller;

import com.project.oskapi.model.Admins;
import com.project.oskapi.repository.UserRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class LoginRegister {
    private final UserRepository adminsRepository;
    public LoginRegister(UserRepository adminsRepository) {
        this.adminsRepository = adminsRepository;
    }


    @GetMapping("/Home")
    public String index(){
        return "HomePage";

    }
    @GetMapping("/Home")
    public String admin(){
        return "/HomePageAdmin";
    }
    @RequestMapping(value = "/Register", method = RequestMethod.GET)
    public String register(Model model){
        return "Register";
    }
    @RequestMapping(value = "/Register", method = RequestMethod.POST)
    public RedirectView saveAddNewAdmin(@ModelAttribute Admins admins){
        Admins newadmins = adminsRepository.save(admins);
        return new RedirectView("/HomePage");
    }
}
