package com.employeeAdress.empAdd.controller;

import com.employeeAdress.empAdd.model.Address;
import com.employeeAdress.empAdd.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @GetMapping("addresses")
    public Iterable<Address> getAllAddresses(){
        return addressService.getAllAddresses();
    }

    @GetMapping("addresses/{id}")
    public Optional<Address> getAddressById(@PathVariable Long id){
        return addressService.getAddressById(id);
    }

    @PostMapping("addresses")
    public void addAddress(@RequestBody Address address){
        addressService.addAddress(address);
    }

    @PutMapping("addresses/{id}/{street}/{city}/{zipcode}")
    public String updateAddressById(@PathVariable Long id, @PathVariable String street,@PathVariable String city, @PathVariable String zipcode){
        return addressService.updateAddressById(id,street,city,zipcode);
    }

    @DeleteMapping("addresses/{id}")
    public String deleteAdd(@PathVariable Long id){
        return addressService.deleteAdd(id);
    }
}
