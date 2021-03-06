package com.example.springboot.controller.rest;

import com.example.springboot.dao.CategoryDAO;
import com.example.springboot.dao.BookDAO;
import com.example.springboot.entity.Book;
import com.example.springboot.exception.ApiRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.springboot.service.BookService;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest")
public class BookRestController {

    @Autowired
    BookService proService;
    @Autowired
    CategoryDAO CateDAO;

    /**
     * getAll program
     * @return
     */
    @GetMapping("/book")
    public List<Book> getAll(){
        try {
            return proService.findAll();
        }catch (Exception e){
            throw new ApiRequestException("Oops can't get all book");
        }
    }

    /**
     * getOne program
     * @param id
     * @return
     */
    @GetMapping("/book/{id}")
    public Book getOne(@PathVariable Integer id){
        try {
            return proService.findById(id);
        }catch (Exception e){
            throw new ApiRequestException("Oops can't get one book");
        }
    }

    /**
     * create program
     * @param pro
     * @return
     */
    @PostMapping("/book")
    public Book create(@RequestBody Book pro){
        try {
            int cateID = pro.getCate().getCategoryID();
            CateDAO.findById(cateID).orElseThrow(() -> new ApiRequestException("Oops can't create book because "+cateID+" is null"));
            return proService.save(pro);
        }catch (Exception e){
            throw new ApiRequestException("Oops can't create book");
        }
    }

    /**
     * update program
     * @param id
     * @param pro
     * @return
     */
    @PutMapping("/book/{id}")
    public Book update(@PathVariable Integer id, @RequestBody Book pro){
        try {
            return proService.save(pro);
        }catch (Exception e) {
            throw new ApiRequestException("Oops can't update book");
        }
    }

    /**
     * delete program
     * @param id
     */
    @DeleteMapping("/book/{id}")
    public void delete(@PathVariable Integer id){
        try {
            proService.deleteById(id);
        }catch (Exception e){
            throw new ApiRequestException("Oops can't delete book");
        }
    }
}
