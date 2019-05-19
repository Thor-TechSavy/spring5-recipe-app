package com.springframework.spring5recipeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by shivam (techSavyThor) on 05/18/2019
 */
@Controller
public class IndexController {

    @RequestMapping({"","/","/index"})
    public String getIndexPage(){
        System.out.println("some msg");
        return "index";
    }
}


