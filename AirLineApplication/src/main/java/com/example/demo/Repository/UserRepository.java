package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event.ID;
import com.example.demo.user.User;
public interface UserRepository extends JpaRepository<User ,Integer> {


	//User findByUsername(String username);

}
	


