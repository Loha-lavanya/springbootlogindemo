package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.UserRepository;
import com.example.demo.model.User;
@Service

public class UserService {

@Autowired
private UserRepository repo;
	public User SaveUser(User user)
	{
		repo.save(user);
		return user;
		
	}
	public User findByUserEmail(String email) {
		User user=repo.findByEmailId(email);
		return user;
	}
	public User findByUserEmailAndPassword(String email,String password)
	{
		User user=repo.findByEmailIdAndPassword(email,password);
		return user;
	}
	
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
}