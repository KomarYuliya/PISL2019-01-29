package by.it.group673601.komar.rest.rest_api.src.main.java.net.rest.customerdemo.rest;

import net.rest.customerdemo.model.Customer;
import net.rest.customerdemo.service.CustomerService;
import net.rest.customerdemo.service.CustomerServiceimpl;
import org.hibernate.cfg.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private CustomerService customerService=new CustomerServiceimpl(new Configuration().configure().buildSessionFactory());

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Customer> getCustomer(@PathVariable("id") Long customerId){
        if(customerId==null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Customer customer=this.customerService.getById(customerId);
        if(customer==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Customer> saveCustomer(@RequestBody @Valid Customer customer){
        HttpHeaders headers=new HttpHeaders();
        if(customer==null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        this.customerService.save(customer);
        return new ResponseEntity<>(customer, headers, HttpStatus.CREATED);
    }

    @RequestMapping(value = "", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Customer> updateCustomer(@RequestBody @Valid Customer customer, UriComponentsBuilder builder){
        HttpHeaders headers=new HttpHeaders();
        if(customer==null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        this.customerService.save(customer);
        return new ResponseEntity<>(customer, headers, HttpStatus.OK);
    }
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public  ResponseEntity<Customer> deleteCustomer(@PathVariable("id") Long id){
        Customer customer=this.customerService.getById(id);
        if(customer==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        this.customerService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @RequestMapping(value = "", method = RequestMethod.GET/*, produces = MediaType.APPLICATION_JSON_UTF8_VALUE*/)
    public ResponseEntity<List<Customer>> getAllCustomers(){
        List<Customer> customers=this.customerService.getAll();
        if(customers.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }
//    public String getAllCustomers(Model model){
//        Model persons = model.addAttribute("persons", this.customerService.getAll());
//        return "tableWindow";
//    }

}
