package com.example.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.demo.model.BankModel;

@EnableJpaRepositories
@Repository
public interface BankRepo extends JpaRepository<BankModel, Integer> {
	
Optional<BankModel>findOneByEmailAndPassword(String email,String password);

  

}
