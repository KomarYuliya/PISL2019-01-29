package by.it.group673601.komar.rest.rest_api.src.main.java.net.rest.customerdemo.rest;

import net.rest.customerdemo.model.Customer;
import net.rest.customerdemo.model.ResultObject;
import net.rest.customerdemo.service.CustomerService;
import net.rest.customerdemo.service.CustomerServiceimpl;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SecondController {
    CustomerService customerService=new CustomerServiceimpl(new Configuration().configure().buildSessionFactory());
    @RequestMapping(value = "/table", method = RequestMethod.GET)
    public String getTable(Model model, @ModelAttribute ResultObject resultObject, @ModelAttribute Customer customer){
        List<Customer> list=customerService.getAll();
        model.addAttribute("toDelete", resultObject);
        model.addAttribute("updateObject", customer);
        model.addAttribute("persons", list);
        return "tableWindow";
    }
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void delete(Model model){

    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public void create(Model model, @ModelAttribute Customer customer){
        customerService.save(customer);
        getTable(model, new ResultObject(), new Customer());
    }
    @RequestMapping(value = "/table/{id}", method = RequestMethod.GET)
    public String getOne(Model model, @PathVariable("id") Long id){
        Customer customer=customerService.getById(id);
        List<Customer> list=new ArrayList<>();
        list.add(customer);
        model.addAttribute("persons", list);
        return "tableWindow";
    }
}
