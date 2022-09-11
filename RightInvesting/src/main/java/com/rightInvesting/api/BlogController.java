package com.rightInvesting.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blogs")
public class BlogController {
	
	@Autowired
	BlogService blogservice;
	
	@GetMapping("/hello")
	public Blog getBlog() {
		
		
		return blogservice.getBlogByTittle();
	
	}

	
}
