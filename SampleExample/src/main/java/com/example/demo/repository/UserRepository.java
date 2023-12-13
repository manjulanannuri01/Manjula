package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.User;

import jakarta.persistence.Id;

public interface UserRepository extends JpaRepository<User, Id> {

}
