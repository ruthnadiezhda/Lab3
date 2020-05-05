package com.example.laboratorio3.controller;

import com.example.laboratorio3.repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//COMPLETAR
@Controller
@RequestMapping("/search")
public class SearchController {

    //COMPLETAR

    @Autowired
    EmployeesRepository employeesRepository;

    @GetMapping(value = {"","/"})
    public String indice(){
        return "Search/indice";
    }

    @GetMapping(value = "/empleadosSalarioMayor")
    public String empleadosMayorSueldo (Model model){
        model.addAttribute("listaEmpleadosMayorSueldo", employeesRepository.obtenerEmpleadosSalarioMayor());

        return "Search/empleadosMayorSueldo";
    }


//COMPLETAR


}
