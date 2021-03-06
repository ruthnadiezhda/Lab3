package com.example.laboratorio3.repository;


import com.example.laboratorio3.dto.EmployeesJobsDto;
import com.example.laboratorio3.entity.Employees;
import com.example.laboratorio3.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeesRepository extends JpaRepository<Employees,Integer> {

    @Query(value = "select e.first_name as nombre, e.last_name as apellido, jh.start_date as fechainicio, jh.end_date as fechafin, j.job_title as puesto" +
            "FROM hr.employees e" +
            "INNER JOIN hr.job_history jh on (e.employee_id = jh.employee_id)" +
            "INNER JOIN hr.jobs j on (j.job_id = jh.job_id)" +
            "WHERE (salary>15000)", nativeQuery= true)
    List<EmployeesJobsDto> obtenerEmpleadosSalarioMayor();



    @Query()

    //Estaba haciendo el query --> SELECT d.department_name,
    //FROM hr.locations l
    //INNER JOIN hr.departments d on (l.location_id = d.location_id)
    //INNER JOIN hr.jobs j (
    public List <Employees> encontrarPorSueldo(Job job);


