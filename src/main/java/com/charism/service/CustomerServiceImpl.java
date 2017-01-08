package com.charism.service;

import com.charism.model.Customer;
import com.charism.repository.CustomerRepository;
import com.charism.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

/**
 * Created by Pradeep on 1/5/2017.
 */
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
}
