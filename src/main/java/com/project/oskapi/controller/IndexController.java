package com.project.oskapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    @RequestMapping(value = "/coursant", method = RequestMethod.GET)
    public String coursantIndex(Model model){
        return "HomePageCoursant";
    }
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String adminIndex(Model model){
        return "HomePageAdmin";
    }
    @RequestMapping(value = "/office", method = RequestMethod.GET)
    public String officeIndex(Model model){
        return "HomePageOffice";
    }
    @RequestMapping(value = "/trainer", method = RequestMethod.GET)
    public String trainerIndex(Model model){
        return "HomePageTrainer";
    }
    @RequestMapping(value = "/HomePage", method = RequestMethod.GET)
    public String index(Model model){
        return "HomePage";
    }
}
