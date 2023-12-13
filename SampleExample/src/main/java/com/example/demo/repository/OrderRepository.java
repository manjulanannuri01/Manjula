package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Order;

import jakarta.persistence.Id;

public interface OrderRepository extends JpaRepository<Order,Id>{

}
