package com.example.springboot.service.implement;

import com.example.springboot.dao.ProductDAO;
import com.example.springboot.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.springboot.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDAO proDAO;

    @Override
    public List<Product> findAll() {
        return proDAO.findAll();
    }

    @Override
    public <S extends Product> S save(S entity) {
        return proDAO.save(entity);
    }

    @Override
    public Product findById(Integer integer) {
        return proDAO.findById(integer).get();
    }

    @Override
    public void deleteById(Integer integer) {
        proDAO.deleteById(integer);
    }
}
