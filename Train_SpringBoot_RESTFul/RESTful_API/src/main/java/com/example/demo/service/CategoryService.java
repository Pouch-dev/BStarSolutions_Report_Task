package com.example.demo.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.example.demo.entity.Category;

public interface CategoryService{

	Category getById(Integer id);

	void delete(Category entity);

	void deleteById(Integer id);

	Category findById(Integer id);

	List<Category> findAll(Sort sort);

	List<Category> findAll();

	Page<Category> findAll(Pageable pageable);

	<S extends Category> S save(S entity);

	Category create(Category category);

	Category update(Category category);

	void delete(Integer id);

}
