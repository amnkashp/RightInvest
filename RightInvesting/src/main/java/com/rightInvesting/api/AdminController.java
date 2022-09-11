package com.rightInvesting.api;

import java.awt.PageAttributes.MediaType;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rightInvesting.ip.User;

@CrossOrigin
@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	/*
	 * @Autowired(required = true) UserRepository userRepository;
	 */
	
	@PostMapping()
	public User adduser() {
		
		return null;
	}
	
	
	
	@GetMapping("/getUser/{userid}")
	public User getUser(@RequestBody  @PathVariable("userid") Integer userid) throws HttpMediaTypeNotAcceptableException   {
		System.out.println("Come to the rest controller");
		Integer uid = userid;
		
		User user = new User();
		
		 user = adminService.getUser(uid);
		 
		 
		 return user;
	}
	
	
	
	@GetMapping(value= "/getUserslist")
	public List<User> getUserList(){
		List<User> userlist = new ArrayList<User>();
		userlist = adminService.getAllUser();
		
		return userlist ; 
	}
	
	
	

}
