package net.rest.customerdemo.service;

import net.rest.customerdemo.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerServiceimpl implements CustomerService{

    SessionFactory factory;

    public CustomerServiceimpl() {
    }

    public CustomerServiceimpl(SessionFactory factory){
        this.factory=factory;
    }
    @Override
    public Customer getById(Long id) {
        Customer result=new Customer();

        try(Session session=factory.openSession()){
            result=session.get(Customer.class, id);
        }
        catch (Exception e){
            System.out.println("Error "+e.getMessage());
        }
        finally {
            if(result==null){
                result=new Customer();
                result.setId(Integer.toUnsignedLong(0));
                return result;
            }
            return result;
        }
    }

    @Override
    public void save(Customer customer) {
        Date date=new Date();
        try(Session session=factory.openSession()){
            session.beginTransaction();
            customer.setId(date.getTime());
            session.saveOrUpdate(customer);
            session.getTransaction().commit();
        }
        catch (Exception e){
            System.out.println("Error "+e.getMessage());
        }
    }

    @Override
    public void delete(Long id) {
        Customer customer=getById(id);
        try(Session session=factory.openSession()){
            session.beginTransaction();
            session.delete(customer);
            session.getTransaction().commit();
            int i=0;
        }
        catch (Exception e){
            System.out.println("Error "+e.getMessage());
        }
    }

    @Override
    public List<Customer> getAll() {
        List<Customer> customers=new ArrayList<>();
        try(Session session=factory.openSession()){
            Query query=session.createQuery("from "+Customer.class.getSimpleName());
            customers=query.list();
        }
        return customers;
    }
}
