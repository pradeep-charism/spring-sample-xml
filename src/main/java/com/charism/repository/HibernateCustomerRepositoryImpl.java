package com.charism.repository;

import com.charism.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pradeep on 1/5/2017.
 */
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    private String dbUser;

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    @Override
    public List<Customer> findAll(){
        System.out.println("DB User connecting is: "+ dbUser);
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Pradeep", "Kumar"));
        return customers;
    }
}
