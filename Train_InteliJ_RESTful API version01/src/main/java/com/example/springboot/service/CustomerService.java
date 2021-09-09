package com.example.springboot.service;

import com.example.springboot.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> findAll();

    <S extends Customer> S save(S entity);

    Customer findById(Integer integer);

    void deleteById(Integer integer);
}
