package com.ddf.msscbrewery.service;

import com.ddf.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

/**
 * Created by InnocentTIALO on 4/18/2020.
 */
public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteById(UUID customerId);
}
