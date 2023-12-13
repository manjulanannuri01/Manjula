package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.FileData;
import com.example.demo.model.File_Data;

public interface File_Repository extends JpaRepository<File_Data, Integer> {

	FileData save(FileData fileData);



}
