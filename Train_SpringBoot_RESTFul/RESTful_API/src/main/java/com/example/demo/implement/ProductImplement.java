package com.example.demo.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductDAO;
import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@Service
public class ProductImplement implements ProductService{
	
	@Autowired
	ProductDAO proDAO;

	@Override
	public <S extends Product> S save(S entity) {
		return proDAO.save(entity);
	}

	@Override
	public List<Product> findAll() {
		return proDAO.findAll();
	}

	@Override
	public List<Product> findAll(Sort sort) {
		return proDAO.findAll(sort);
	}

	@Override
	public Product findById(Integer id) {
		return proDAO.findById(id).get();
	}

	@Override
	public void deleteById(Integer id) {
		proDAO.deleteById(id);
	}

	@Override
	public Product getById(Integer id) {
		return proDAO.getById(id);
	}

	@Override
	public Product create(Product product) {
		return proDAO.save(product);
	}

	@Override
	public Product update(Product product) {
		return proDAO.save(product);
	}

	@Override
	public void delete(Integer id) {
		proDAO.deleteById(id);
	}

	
}
