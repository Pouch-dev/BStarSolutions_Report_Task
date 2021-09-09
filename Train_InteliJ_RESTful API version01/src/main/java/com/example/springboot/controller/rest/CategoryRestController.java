package com.example.springboot.controller.rest;

import com.example.springboot.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.springboot.service.CategoryService;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest")
public class CategoryRestController {

    @Autowired
    CategoryService cateService;

    /**
     * getAll program
     * @return
     */
    @GetMapping("/category")
    public List<Category> getAll(){
        return cateService.findAll();
    }

    /**
     * getOne program
     * @param id
     * @return
     */
    @GetMapping("/category/{id}")
    public Category getOne(@PathVariable Integer id){
        return cateService.findById(id);
    }

    /**
     * create program
     * @param cate
     * @return
     */
    @PostMapping("/category")
    public Category create(@RequestBody Category cate){
        return cateService.save(cate);
    }

    /**
     * update program
     * @param id
     * @param cate
     * @return
     */
    @PutMapping("/category/{id}")
    public Category update(@PathVariable Integer id, @RequestBody Category cate){
        return cateService.save(cate);
    }

    /**
     * delete program
     * @param id
     */
    @DeleteMapping("/category/{id}")
    public void delete(@PathVariable Integer id){
        cateService.deleteById(id);
    }
}
