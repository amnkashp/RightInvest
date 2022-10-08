package com.rightInvesting.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

public interface BlogDao {
	
	public List<Blog> getBlogNew(String Tittle); 

}
