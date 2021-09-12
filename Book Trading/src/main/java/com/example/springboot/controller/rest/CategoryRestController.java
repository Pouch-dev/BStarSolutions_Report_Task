package com.example.springboot.controller.rest;

import com.example.springboot.entity.Category;
import com.example.springboot.exception.ApiRequestException;
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
        try{
            return cateService.findAll();
        }catch (Exception e){
            throw new ApiRequestException("Oops can't get all category");
        }
    }

    /**
     * getOne program
     * @param id
     * @return
     */
    @GetMapping("/category/{id}")
    public Category getOne(@PathVariable Integer id){
        try{
            return cateService.findById(id);
        }catch (Exception e){
            throw new ApiRequestException("Oops can't get one category");
        }
    }

    /**
     * create program
     * @param cate
     * @return
     */
    @PostMapping("/category")
    public Category create(@RequestBody Category cate){
        try{
            return cateService.save(cate);
        }catch (Exception e){
            throw new ApiRequestException("Oops can't create category");
        }
    }

    /**
     * update program
     * @param id
     * @param cate
     * @return
     */
    @PutMapping("/category/{id}")
    public Category update(@PathVariable Integer id, @RequestBody Category cate){
        try{
            return cateService.save(cate);
        }catch (Exception e){
            throw new ApiRequestException("Oops can't update category");
        }
    }

    /**
     * delete program
     * @param id
     */
    @DeleteMapping("/category/{id}")
    public void delete(@PathVariable Integer id){
        try{
            cateService.deleteById(id);
        }catch (Exception e){
            throw new ApiRequestException("Oops can't delete category");
        }
    }
}
