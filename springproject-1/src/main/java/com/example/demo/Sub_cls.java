package com.example.demo;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties.Jdbc;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class Sub_cls implements Design{

	JdbcTemplate jt;
@Autowired
Data d;
Scanner sc;
public Sub_cls() {
	sc=new Scanner(System.in);
	
}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("hiii");
		Integer id;
		String name;
		float sal;
		System.out.println("enter id ");
		id=sc.nextInt();
		System.out.println("enetr name");
		name=sc.next();
		System.out.println("enter sal");
		sal=sc.nextFloat();
		
		d.setId(id);
		d.setName(name);
		d.setSal(sal);
		String qrl="insert tnto jj values(?,?,?)";
		
	}
	

}
