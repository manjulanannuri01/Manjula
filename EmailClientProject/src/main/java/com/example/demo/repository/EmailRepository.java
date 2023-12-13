package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.EmailDetails;

import jakarta.persistence.Id;

public interface EmailRepository extends JpaRepository<EmailDetails, Id> {

}
