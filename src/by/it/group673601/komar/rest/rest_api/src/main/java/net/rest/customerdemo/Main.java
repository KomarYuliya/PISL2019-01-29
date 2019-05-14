package by.it.group673601.komar.rest.rest_api.src.main.java.net.rest.customerdemo.service;

import net.rest.customerdemo.model.Customer;
import net.rest.customerdemo.service.CustomerService;
import net.rest.customerdemo.service.CustomerServiceimpl;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args){
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        CustomerService customerService=new CustomerServiceimpl(factory);
        Customer customer=new Customer();
        customer.setId(Integer.toUnsignedLong(123));
        customer.setFirstName("name");
        customer.setLastName("name");
        customer.setAddress("address");
        customer.setBudget(123);
        customerService.save(customer);
    }
}
