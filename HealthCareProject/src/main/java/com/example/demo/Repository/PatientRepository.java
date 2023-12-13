package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.PatientProfile;

import jakarta.persistence.Id;
@Repository
public interface PatientRepository extends JpaRepository<PatientProfile, Id> {

}
