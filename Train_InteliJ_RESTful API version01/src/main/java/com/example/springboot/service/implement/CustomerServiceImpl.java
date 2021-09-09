package com.example.springboot.service.implement;

import com.example.springboot.dao.CustomerDAO;
import com.example.springboot.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.springboot.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerDAO useDAO;

    @Override
    public List<Customer> findAll() {
        return useDAO.findAll();
    }

    @Override
    public <S extends Customer> S save(S entity) {
        return useDAO.save(entity);
    }

    @Override
    public Customer findById(Integer integer) {
        return useDAO.findById(integer).get();
    }

    @Override
    public void deleteById(Integer integer) {
        useDAO.deleteById(integer);
    }
}
