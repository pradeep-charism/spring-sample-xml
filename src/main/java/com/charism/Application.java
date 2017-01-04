package com.charism;

import com.charism.model.Customer;
import com.charism.service.CustomerService;
import com.charism.service.CustomerServiceImpl;

import java.util.List;

/**
 * Created by Pradeep on 1/5/2017.
 */
public class Application {
    public static void main(String[] args) {
        CustomerService service = new CustomerServiceImpl();
        List<Customer> customers = service.findAll();
        System.out.println(customers);
    }
}
