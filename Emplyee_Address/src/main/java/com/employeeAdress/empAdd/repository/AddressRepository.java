package com.employeeAdress.empAdd.repository;

import com.employeeAdress.empAdd.model.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}
