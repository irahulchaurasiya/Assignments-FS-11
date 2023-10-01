package com.Ecommerce.eCommerce.repository;

import com.Ecommerce.eCommerce.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address , Integer> {
}
