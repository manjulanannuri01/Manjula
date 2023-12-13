package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.EmpDetails;
@Repository
public interface EmpRepository extends JpaRepository<EmpDetails, Integer> {

}


