package com.example.springboot.dao;

import com.example.springboot.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookDAO extends JpaRepository<Book, Integer> {
}
