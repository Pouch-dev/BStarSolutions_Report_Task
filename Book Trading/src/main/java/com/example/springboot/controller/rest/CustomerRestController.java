package com.example.springboot.controller.rest;

import com.example.springboot.dao.CustomerDAO;
import com.example.springboot.entity.Book;
import com.example.springboot.entity.Customer;
import com.example.springboot.exception.ApiRequestException;
import com.example.springboot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest")
public class CustomerRestController {

    @Autowired
    CustomerService custService;
    @Autowired
    BCryptPasswordEncoder pe;

    /**
     * getAll program
     * @return
     */
    @GetMapping("/customer")
    public List<Customer> getAll(){
        try {
            return custService.findAll();
        }catch (Exception e){
            throw new ApiRequestException("Oops can't get all customer");
        }
    }

    /**
     * getOne program
     * @param id
     * @return
     */
    @GetMapping("/customer/{id}")
    public Customer getOne(@PathVariable Long id, @RequestBody Customer customer){
        try {
            System.out.println("User "+customer.getUsername()+" with password: "+pe.encode(customer.getPassword()));
            return custService.findById(id);
        }catch (Exception e){
            throw new ApiRequestException("Oops can't get one customer");
        }
    }

    /**
     * create program
     * @param customer
     * @return
     */
    @PostMapping("/customer")
    public Customer create(@RequestBody Customer customer){
        try {
            System.out.println("User "+customer.getUsername()+" with password: "+pe.encode(customer.getPassword()));
            return custService.save(customer);
        }catch (Exception e){
            throw new ApiRequestException("Oops can't create customer");
        }
    }

    /**
     * update program
     * @param id
     * @param customer
     * @return
     */
    @PutMapping("/customer/{id}")
    public Customer update(@PathVariable Integer id, @RequestBody Customer customer){
        try {
            System.out.println("User "+customer.getUsername()+" with password: "+pe.encode(customer.getPassword()));
            return custService.save(customer);
        }catch (Exception e){
            throw new ApiRequestException("Oops can't update customer");
        }
    }

    /**
     * delete program
     * @param id
     */
    @DeleteMapping("/customer/{id}")
    public void delete(@PathVariable Long id){
        try{
        custService.deleteById(id);
        }catch (Exception e){
            throw new ApiRequestException("Oops can't delete customer");
        }
    }

    //find account by phone number
    @GetMapping("/customer/phone/{phoneID}")
    public Customer getPhone(@PathVariable String phoneID,@RequestBody Customer customer){
        try {
            System.out.println("User "+customer.getUsername()+" with password: "+pe.encode(customer.getPassword()));
            return custService.findByPhone(phoneID);
        }catch (Exception e){
            throw new ApiRequestException("Oops can't get phone customer");
        }
    }

    //find account by username
    @GetMapping("/customer/username/{user}")
    public Customer getUsername(@PathVariable String user,@RequestBody Customer customer){
        try {
            System.out.println("User "+customer.getUsername()+" with password: "+pe.encode(customer.getPassword()));
            return custService.findByUsername(user);
        }catch (Exception e){
            throw new ApiRequestException("Oops can't get username customer");
        }
    }
}
