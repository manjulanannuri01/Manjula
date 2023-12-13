package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Medicine;

import jakarta.persistence.Id;
@Repository
public interface medicineRepository extends JpaRepository<Medicine, Id> {

}
