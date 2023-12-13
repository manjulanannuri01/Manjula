package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springproject1Application {

	public static void main(String[] args) {
		 ConfigurableApplicationContext cxt=SpringApplication.run(Springproject1Application.class, args);
		 Design d=(Design) cxt.getBean("sub_cls");
		 d.save();
	}

}
