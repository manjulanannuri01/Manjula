package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Order;
import com.example.demo.model.User;
import com.example.demo.repository.OrderRepository;
import com.example.demo.repository.UserRepository;

@Service
public class SampleService {
	@Autowired
	UserRepository userRepository;
	@Autowired
	OrderRepository orderRepository;
	public User usermethod(User user) {
		return userRepository.save(user);
	}
	
  public Order ordermethod(Order order)
  {
	return orderRepository.save(order);
	  
  }

}
