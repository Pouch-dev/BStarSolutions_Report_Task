package com.example.springboot.dao;

import com.example.springboot.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Map;
import java.util.Optional;

public interface CustomerDAO extends JpaRepository<Customer, Long> {

    //find account by phone number
    @Query("SELECT o FROM Customer o WHERE o.phoneNumber LIKE ?1")
    Optional<Customer> findByPhone(String phoneID);

    //find account by username
    @Query("SELECT o FROM Customer o WHERE o.username LIKE ?1")
    Optional<Customer> findByUsername(String username);
}
