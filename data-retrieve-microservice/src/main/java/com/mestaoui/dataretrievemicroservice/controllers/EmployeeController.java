package com.mestaoui.dataretrievemicroservice.controllers;

import com.mestaoui.dataretrievemicroservice.entities.Employee;
import com.mestaoui.dataretrievemicroservice.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    private List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    @GetMapping("/fullname/{fullname}")
    private Employee getByFullName(@PathVariable String fullname) {
        return employeeRepository.getEmployeeByFullName(fullname);
    }

    @GetMapping("/company/{companyname}")
    private List<Employee> getByCompanyName(@PathVariable String companyname) {
        return employeeRepository.getEmployeesByCompanyName(companyname);
    }
}
