package com.example.laboratorio3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//COMPLETAR
@Controller
@RequestMapping("/search")
public class SearchController {

    //COMPLETAR

    @GetMapping(value = {"","/"})
    public String indice(){
        return "Search/indice";
    }


//COMPLETAR


}
