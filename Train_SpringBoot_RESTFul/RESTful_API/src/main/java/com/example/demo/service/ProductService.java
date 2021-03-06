package com.example.demo.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.example.demo.entity.Product;

public interface ProductService {

	Product getById(Integer id);

	void deleteById(Integer id);

	Product findById(Integer id);

	List<Product> findAll(Sort sort);

	List<Product> findAll();

	<S extends Product> S save(S entity);

	Product create(Product product);

	Product update(Product product);

	void delete(Integer id);

}
