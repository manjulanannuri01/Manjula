package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Repository.UserRepository;
import com.example.demo.user.User;

@Service
public class UserService {
		@Autowired
	    UserRepository userRepository;
		
		public User registerForm(User user) {
			//User user1=new User(user,user.getDate());
			return userRepository.save(user);
		}
//		public User findByUserName(String userName){
//			return userDao.findByUserName(userName);
//		}

	}



