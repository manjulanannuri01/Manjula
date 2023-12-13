package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.EdmsData;

@Repository
public interface EdmsRepository extends JpaRepository<EdmsData, Integer>{

	

}
