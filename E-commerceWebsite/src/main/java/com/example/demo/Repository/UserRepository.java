package com.example.demo.Repository;
 
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.User;

public interface UserRepository extends JpaRepository<User,Integer>{
	User findByEmailId(String email);

	User findByEmailIdAndPassword(String email, String password);
}
