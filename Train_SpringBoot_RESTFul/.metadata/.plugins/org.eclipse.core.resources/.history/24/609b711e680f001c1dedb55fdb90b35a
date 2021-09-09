package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/rest/product")
public class REST_ProductController {
	
	@Autowired
	ProductService proService;
	
	/**
	 * getAll program
	 * @param id
	 * @return
	 */
	@GetMapping()
	public List<Product> getAll(){
		return proService.findAll();
	}

	/**
	 * getOne program
	 * @param id
	 * @return
	 */
	@GetMapping("id")
	public Product getOne(@PathVariable("id") Integer id) {
		return proService.findById(id);
	}
	
	/**
	 * create program
	 * @param product
	 * @return
	 */
	@PostMapping("id")
	public Product create(@RequestBody Product product) {
		return proService.create(product);
	}
	
	/**
	 * update program
	 * @param product
	 * @return
	 */
	@PutMapping("id")
	public Product update(@RequestBody Product product) {
		return proService.update(product);
	}
	
	/**
	 * delete program
	 * @param id
	 */
	@DeleteMapping("id")
	public void delete(@PathVariable("id") Integer id) {
		proService.delete(id);
	}
}
