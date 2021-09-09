package com.example.springboot.service;

import com.example.springboot.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    <S extends Product> S save(S entity);

    Product findById(Integer integer);

    void deleteById(Integer integer);
}
