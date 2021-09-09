package com.example.springboot.controller.rest;

import com.example.springboot.dao.CategoryDAO;
import com.example.springboot.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.springboot.service.ProductService;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest")
public class ProductRestController {

    @Autowired
    ProductService proService;
    @Autowired
    CategoryDAO CateDAO;

    /**
     * getAll program
     * @return
     */
    @GetMapping("/product")
    public List<Product> getAll(){
        return proService.findAll();
    }

    /**
     * getOne program
     * @param id
     * @return
     */
    @GetMapping("/product/{id}")
    public Product getOne(@PathVariable Integer id){
        return proService.findById(id);
    }

    /**
     * create program
     * @param pro
     * @return
     */
    @PostMapping("/product")
    public Product create(@RequestBody Product pro) throws Exception{
        int cateID = pro.getCate().getIdc();
        CateDAO.findById(cateID).orElseThrow(() -> new IllegalArgumentException("in not found!"));
        return proService.save(pro);
    }

    /**
     * update program
     * @param id
     * @param pro
     * @return
     */
    @PutMapping("/product/{id}")
    public Product update(@PathVariable Integer id, @RequestBody Product pro){
        return proService.save(pro);
    }

    /**
     * delete program
     * @param id
     */
    @DeleteMapping("/product/{id}")
    public void delete(@PathVariable Integer id){
        proService.deleteById(id);
    }
}
