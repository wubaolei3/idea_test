package com.wbl.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {


    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        System.out.println("s");
        return page;
    }
}
