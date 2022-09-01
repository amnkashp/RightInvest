package com.rightInvesting.api;

import java.util.List;

import com.rightInvesting.ip.User;

public interface AdminService {
	
	public User getUser(Integer userid);
	
	public List<User> getAllUser();

}
