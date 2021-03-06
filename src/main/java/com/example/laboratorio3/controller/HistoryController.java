package com.example.laboratorio3.controller;


import com.example.laboratorio3.repository.EmployeesRepository;
import com.example.laboratorio3.repository.JobHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//COMPLETAR
@Controller
@RequestMapping(value="/history")
public class HistoryController {

    @Autowired
    JobHistoryRepository jobHistoryRepository;

    @GetMapping(value = {""})
    public String listaEmpleados(Model model) {

        model.addAttribute("listaHistory", jobHistoryRepository.findAll());

        return "history/listar";
    }


}
