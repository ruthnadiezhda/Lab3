package com.example.laboratorio3.controller;

import com.example.laboratorio3.entity.Employees;
import com.example.laboratorio3.repository.DepartmentRepository;
import com.example.laboratorio3.repository.EmployeesRepository;
import com.example.laboratorio3.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.jws.WebParam;
import java.util.List;
import java.util.Optional;

//COMPLETAR
@Controller
@RequestMapping("/empleado")
public class EmployeeController {

    //COMPLETAR
    @Autowired
    EmployeesRepository employeesRepository;

    @Autowired
    JobRepository jobRepository;

    @Autowired
    DepartmentRepository departmentRepository;





    @GetMapping(value = {""})
    public String listaEmployee(Model model){
        //COMPLETAR

        model.addAttribute("listaEmpleados", employeesRepository.findAll());


        // List<EmpleadosRegionDto> listaEmxRegion = categoryRepository.obtenerEmpleadosPorRegion();

        // List<EmpleadosPaisDto> listaEmxPais = categoryRepository.obtenerEmpleadosPorPais();





        return "employee/lista";
    }



    @GetMapping(value = {"/nuevo"})
    public String nuevoEmployeeForm(Model model) {
        //COMPLETAR

        model.addAttribute("listaJobs",jobRepository.findAll());
        model.addAttribute("listaDepas",departmentRepository.findAll());



        return "employee/newFrm";

    }


    @GetMapping(value = {"/guardar"})
    public String guardarEmployee(Employees employees, RedirectAttributes attr) {

        employeesRepository.save(employees);

        return "redirect:/empleado";

    }


    @GetMapping(value = {"/editar"})
    public String editarEmployee(@RequestParam("id") int id, Model model) {

        model.addAttribute("listaJobs",jobRepository.findAll());
        model.addAttribute("listaDepas",departmentRepository.findAll());

        Optional<Employees> opt = employeesRepository.findById(id);

        if (opt.isPresent()){
            Employees emple = opt.get();
            model.addAttribute("emple",emple);
            return "employee/editFrm";
        }else{
            return "redirect:/producto";
        }



        //COMPLETAR


    }


    public String borrarEmpleado() {

       //COMPLETAR

    }

    //COMPLETAR

}
