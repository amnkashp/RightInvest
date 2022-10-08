package com.rightInvesting.api;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BlogServiceimplementation implements BlogService {

	@Autowired
	BlogDao blogDao;


	@Transactional("myTransactionManager")
	@Override
	public List<Blog> getBlogByTittleNew(String tittle) {
		
		return blogDao.getBlogNew(tittle);
	}

	

	

	
}
