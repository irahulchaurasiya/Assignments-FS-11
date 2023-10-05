package com.employeeAdress.empAdd.controller;

import com.employeeAdress.empAdd.model.Employee;
import com.employeeAdress.empAdd.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("employees")
    public Iterable<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("employee/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("employees")
    public void addEmp(@RequestBody Employee employee){
        employeeService.addEmp(employee);
    }

    @PutMapping("employees/{id}/{firstName}/{lastName}")
    public String updateEmpById(@PathVariable Long id,@PathVariable String firstName, @PathVariable String lastName){
        return employeeService.updateEmpById(id,firstName,lastName);
    }

    @DeleteMapping("employees/{id}")
    public String deleteEmp(@PathVariable Long id){
        return employeeService.deleteEmp(id);
    }

}
