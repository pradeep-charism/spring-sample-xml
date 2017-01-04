package com.charism.repository;

import com.charism.model.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pradeep on 1/5/2017.
 */
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll(){
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Pradeep", "Kumar"));
        return customers;
    }
}
