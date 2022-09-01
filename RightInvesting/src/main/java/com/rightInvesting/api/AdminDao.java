package com.rightInvesting.api;

import java.util.List;

import com.rightInvesting.ip.User;

public interface AdminDao {
	
	public User getUser(Integer userid);
	
	public List<User> getUserList();

}
