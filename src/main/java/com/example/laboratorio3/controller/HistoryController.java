package com.example.laboratorio3.controller;


import com.example.laboratorio3.repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//COMPLETAR
@Controller
@RequestMapping(value="/history")
public class HistoryController {

    @Autowired
    EmployeesRepository employeesRepository;

    @GetMapping(value = {""})
    public String listaEmpleados(Model model) {

        model.addAttribute("listaProductos", employeesRepository.findAll());

        return "product/list";
    }


}
