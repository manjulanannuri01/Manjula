package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.BankDto;
import com.example.demo.model.BankModel;
@Repository
public interface BankRepository extends JpaRepository<BankModel, Integer> {

	BankModel save(BankDto model);

	//BankModel save(BankModel login);

	//BankModel save(BankDto dto);

	//LoginDto findbyname(String name);

}
