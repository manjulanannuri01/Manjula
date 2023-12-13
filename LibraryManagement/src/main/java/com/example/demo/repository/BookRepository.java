package com.example.demo.repository;

import java.awt.print.Book;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Books;

import jakarta.persistence.Id;

public interface BookRepository extends JpaRepository<Books, Integer> {





}
