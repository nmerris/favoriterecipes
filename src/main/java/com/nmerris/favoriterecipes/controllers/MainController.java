package com.nmerris.favoriterecipes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    // home page
    @GetMapping(value = {"/", "/index"})
    public String indexPageGet() {
        return "index";
    }


    @GetMapping(value = {"/crabcakes"})
    public String crabcakesPageGet() {
        return "crabcakes";
    }

    @GetMapping(value = {"/gingerale"})
    public String gingeralePageGet() {
        return "gingerale";
    }

    @GetMapping(value = {"/cornbread"})
    public String cornbreadPageGet() {
        return "cornbread";
    }


}