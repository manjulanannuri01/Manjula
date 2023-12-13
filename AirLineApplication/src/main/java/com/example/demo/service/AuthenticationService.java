//package com.example.demo.service;
//import java.util.HashSet;
//import java.util.Set;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.example.demo.Repository.UserRepository;
//import com.example.demo.user.User;
//
//import jakarta.transaction.Transactional;
//@Service
//public abstract class AuthenticationService implements UserDetails{
//	
//	@Autowired
//	UserRepository userRepository;
//	
//	
//	@Transactional
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
//	User user=userRepository.findByUsername(username);
//	Set<SimpleGrantedAuthority> grantedAuthorities=new HashSet<>();
//	grantedAuthorities.add(new SimpleGrantedAuthority("Role_USER"));
//	return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), grantedAuthorities);
//		
//	}
//	
//
//}
