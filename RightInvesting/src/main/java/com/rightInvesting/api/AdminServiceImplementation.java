package com.rightInvesting.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rightInvesting.ip.User;

@Service
public class AdminServiceImplementation implements AdminService{

	@Autowired
	AdminDao adminDao;
	
	@Transactional("myTransactionManager")
	@Override
	public List<User> getAllUser()  {
		
		return adminDao.getUserList() ;
	}
	
	@Transactional("myTransactionManager")
	@Override
	public User getUser(Integer userid) {
		System.out.println("Come to the Service implemenatation ");
		return adminDao.getUser(userid);
		
	}

}
