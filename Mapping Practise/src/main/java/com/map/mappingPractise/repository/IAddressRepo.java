package com.map.mappingPractise.repository;

import com.map.mappingPractise.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address , String> {
}
