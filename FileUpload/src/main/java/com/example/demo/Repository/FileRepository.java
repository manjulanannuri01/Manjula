package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.FileData;
@Repository
public interface FileRepository extends JpaRepository<FileData, Integer> {

}
