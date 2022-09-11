package com.rightInvesting.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BlogServiceimplementation implements BlogService {

	@Autowired
	BlogDao blogDao;
	
	
	@Transactional("myTransactionManager")
	@Override
	public Blog getBlogByTittle() {
		
		return blogDao.getBlog();
	}


	

	
}
