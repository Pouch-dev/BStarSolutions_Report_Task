package com.example.springboot.service.implement;

import com.example.springboot.dao.BookDAO;
import com.example.springboot.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.springboot.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookDAO bookDAO;

    @Override
    public List<Book> findAll() {
        return bookDAO.findAll();
    }

    @Override
    public <S extends Book> S save(S entity) {
        return bookDAO.save(entity);
    }

    @Override
    public Book findById(Integer integer) {
        return bookDAO.findById(integer).get();
    }

    @Override
    public void deleteById(Integer integer) {
        bookDAO.deleteById(integer);
    }
}
