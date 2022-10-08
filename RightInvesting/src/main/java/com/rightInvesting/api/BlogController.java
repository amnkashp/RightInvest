package com.rightInvesting.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blogs")
public class BlogController {
	
	@Autowired
	BlogService blogservice;
	
	@GetMapping("/{tittle}")
	public List<Blog> getBlogs(@PathVariable("tittle") String tittle){
		List<Blog> content;
		content = blogservice.getBlogByTittleNew(tittle);
		
		return content;
	}
	
	
	
	
}
