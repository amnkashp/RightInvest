package com.rightInvesting.ip;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public interface UserService {

	
	public void doSaveUser(User user);
	
	public Date dateStamp() throws Exception;
	
	public LocalTime timeStamp() throws Exception;
}
