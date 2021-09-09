package com.example.springboot.service.implement;

import com.example.springboot.dao.CategoryDAO;
import com.example.springboot.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.springboot.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryDAO cateDAO;

    @Override
    public List<Category> findAll() {
        return cateDAO.findAll();
    }

    @Override
    public <S extends Category> S save(S entity) {
        return cateDAO.save(entity);
    }

    @Override
    public Category findById(Integer integer) {
        return cateDAO.findById(integer).get();
    }

    @Override
    public void deleteById(Integer integer) {
        cateDAO.deleteById(integer);
    }
}
