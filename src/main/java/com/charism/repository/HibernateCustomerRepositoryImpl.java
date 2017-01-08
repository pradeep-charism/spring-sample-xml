package com.charism.repository;

import com.charism.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pradeep on 1/5/2017.
 */
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Value("${dbUser}")
    private String dbUser;

    @Override
    public List<Customer> findAll(){
        System.out.println("DB User connecting is: "+ dbUser);
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Pradeep", "Kumar"));
        return customers;
    }
}
