package com.employeeAdress.empAdd.repository;

import com.employeeAdress.empAdd.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
