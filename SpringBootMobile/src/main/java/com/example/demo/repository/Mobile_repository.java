package com.example.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Mobile_Data;

@Repository
public interface Mobile_repository extends JpaRepository<Mobile_Data, Integer> {

	

	
	

}
