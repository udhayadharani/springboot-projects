package com.example.school.service;


import com.example.school.entity.Address;
import com.example.school.entity.Customer;
import com.example.school.repository.AddressRepository;
import com.example.school.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private AddressRepository addressRepository;

    public String saveCustomer(Customer customer){
        customer=customerRepository.save(customer);
        for(Address i:customer.getAddressList()){
            i.setCustomer(customer);
            addressRepository.saveAndFlush(i);
        }
        return "ok";
    }

}
