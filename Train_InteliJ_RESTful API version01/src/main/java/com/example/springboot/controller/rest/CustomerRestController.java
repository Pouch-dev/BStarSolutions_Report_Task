package com.example.springboot.controller.rest;

import com.example.springboot.entity.Customer;
import com.example.springboot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest")
public class CustomerRestController {

    @Autowired
    CustomerService custService;

    /**
     * getAll program
     * @return
     */
    @GetMapping("/customer")
    public List<Customer> getAll(){
        return custService.findAll();
    }

    /**
     * getOne program
     * @param id
     * @return
     */
    @GetMapping("/customer/{id}")
    public Customer getOne(@PathVariable Integer id){
        return custService.findById(id);
    }

    /**
     * create program
     * @param cust
     * @return
     */
    @PostMapping("/customer")
    public Customer create(@RequestBody Customer cust){
        return custService.save(cust);
    }

    /**
     * update program
     * @param id
     * @param cust
     * @return
     */
    @PutMapping("/customer/{id}")
    public Customer update(@PathVariable Integer id, @RequestBody Customer cust){
        return custService.save(cust);
    }

    /**
     * delete program
     * @param id
     */
    @DeleteMapping("/customer/{id}")
    public void delete(@PathVariable Integer id){
        custService.deleteById(id);
    }
}
