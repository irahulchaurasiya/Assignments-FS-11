package com.employeeAdress.empAdd.service;

import com.employeeAdress.empAdd.model.Employee;
import com.employeeAdress.empAdd.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public Iterable<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    public void addEmp(Employee employee) {
        employeeRepository.save(employee);
    }


    public String updateEmpById(Long id, String firstName, String lastName) {
        Optional<Employee> myEmpOpt=employeeRepository.findById(id);
        Employee myEmp=null;
        if(myEmpOpt.isPresent()){
            myEmp=myEmpOpt.get();
        }else{
            return "Id not found";
        }
        myEmp.setFirstName(firstName);
        myEmp.setLastName(lastName);
        employeeRepository.save(myEmp);
        return "Employee firstName and lastName updated";
    }

    public String deleteEmp(Long id) {
        employeeRepository.deleteById(id);
        return "Employee data deleted";

    }
}