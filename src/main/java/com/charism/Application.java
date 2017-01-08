package com.charism;

import com.charism.model.Customer;
import com.charism.service.CustomerService;
import com.charism.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Pradeep on 1/5/2017.
 */
public class Application {

    private static ClassPathXmlApplicationContext context;

    public static void main(String[] args) {
        try{
            setup();
            CustomerService customerService = context.getBean("customerService", CustomerService.class);
            List<Customer> customers = customerService.findAll();
            System.out.println(customers);
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            context.close();
            context.destroy();
        }

    }

    private static void setup() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.refresh();
    }
}
