package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.UserService;
import com.example.demo.model.User;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
		@Autowired
		private UserService service;
		
		
		
		
		//@ResponseBody
	
		           /****       REGISTRATION                 ****/
	@PostMapping("/registeruser")
	//@CrossOrigin(origins = "http://localhost:4200")
	public User registerUser(@RequestBody User user) throws Exception
	{
		System.out.println("REGISTERATION!!");
		String email=user.getEmailId();
		if(email!=null && !"".equals(email))  
		{
			User obj=service.findByUserEmail(email);
		     if(obj!=null)
		    	  throw new Exception("user with  "+email+" is already exixt!");
		}
			
		User userObj=service.SaveUser(user);
		return userObj;
	}
	
	
	
	@GetMapping("/get")
	public List<User> getAllUsers() {
		System.out.println("GET!!");
		return service.getUsers();
	}

	

	            /*************      LOGIN           ***********/

	@PostMapping("/login")
	@CrossOrigin(origins = "http://localhost:4200")
	public  User loginUser(@RequestBody User user) throws Exception
	{
		System.out.println("LOGIN!!");
		String email=user.getEmailId();
		String epassword=user.getPassword();
		User obj=null;
		if(email!=null && epassword!=null) 
		{
			obj=service.findByUserEmailAndPassword(email, epassword);
		 if(obj==null)
			 throw new Exception("Bad Credentials!");
		 }
		 return obj;
	}
	 
	

}
