package com.example.springboot.service;

import com.example.springboot.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    <S extends Customer> S save(S entity);

    Customer findById(Long integer);

    void deleteById(Long integer);

    Customer findByPhone(String phoneID);

    Customer findByUsername(String user);
}
