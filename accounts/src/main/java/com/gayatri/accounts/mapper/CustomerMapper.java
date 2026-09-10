package com.gayatri.accounts.mapper;

import com.gayatri.accounts.dto.CustomerDto;
import com.gayatri.accounts.entity.Customer;

public class CustomerMapper {

    public static CustomerDto mapToCustomerDetailsDto(Customer customer, CustomerDto customerDto) {
        customerDto.setName(customer.getName());
        customerDto.setMobileNumber(customer.getMobileNumber());
        customerDto.setEmail(customer.getEmail());
        return customerDto;
    }

    public static Customer mapToCustomer(CustomerDto customerDto, Customer customer) {
        customer.setName(customerDto.getName());
        customer.setMobileNumber(customerDto.getMobileNumber());
        customer.setEmail(customerDto.getEmail());
        return customer;
    }
}
