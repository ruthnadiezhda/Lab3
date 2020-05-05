package com.example.laboratorio3.repository;

import com.example.laboratorio3.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesRepository extends JpaRepository<Employees, Integer> {


}
