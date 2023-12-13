package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Laboratary;
import jakarta.persistence.Id;
@Repository
public interface LaborataryRepository extends JpaRepository<Laboratary, Id> {

}
