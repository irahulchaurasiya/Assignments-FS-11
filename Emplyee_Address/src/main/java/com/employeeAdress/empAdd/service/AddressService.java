package com.employeeAdress.empAdd.service;

import com.employeeAdress.empAdd.model.Address;
import com.employeeAdress.empAdd.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    AddressRepository addressRepository;

    public Iterable<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    public Optional<Address> getAddressById(Long id) {
        return addressRepository.findById(id);
    }

    public void addAddress(Address address) {
        addressRepository.save(address);
    }

    public String updateAddressById(Long id, String street, String city, String zipcode) {
        Optional<Address> myAddOpt = addressRepository.findById(id);
        Address myAdd=null;
        if(myAddOpt.isPresent()){
            myAdd=myAddOpt.get();
        }else{
            return "Id not found";
        }
        myAdd.setStreet(street);
        myAdd.setCity(city);
        myAdd.setZipcode(zipcode);

        addressRepository.save(myAdd);
        return "Address updated";
    }

    public String deleteAdd(Long id) {
        addressRepository.deleteById(id);
        return "Address deleted";
    }
}