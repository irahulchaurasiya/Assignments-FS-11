package com.Ecommerce.eCommerce.service;

import com.Ecommerce.eCommerce.model.Address;
import com.Ecommerce.eCommerce.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    AddressRepository addressRepository;
    public void addAddress(Address address) {
        addressRepository.save(address);
    }


}