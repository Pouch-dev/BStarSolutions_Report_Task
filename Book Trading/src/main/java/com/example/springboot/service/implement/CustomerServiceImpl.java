package com.example.springboot.service.implement;

import com.example.springboot.dao.CustomerDAO;
import com.example.springboot.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.springboot.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public Customer findById(Long integer) {
        return useDAO.findById(integer).get();
    }

    @Override
    public void deleteById(Long integer) {
        useDAO.deleteById(integer);
    }

    @Override
    public Customer findByPhone(String phoneID) {
        return useDAO.findByPhone(phoneID).get();
    }

    @Override
    public Customer findByUsername(String username) {
        return useDAO.findByUsername(username).get();
    }
}
