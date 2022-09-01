package com.rightInvesting.ip;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/*import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
*/


@Service
public class UserServiceImplementation implements UserService {

	@Autowired
	UserDao userDao;

	
	  @Transactional("myTransactionManager")
	  @Override 
	  public void doSaveUser(User user) {
	  userDao.doSaveUser(user); 
		  }

	@Transactional("myTransactionManager")
	@Override
	public Date dateStamp() throws Exception {
		
		LocalDate localdate = LocalDate.now();
		String dateformate = localdate.toString(); // convert to string 
		Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateformate); //convert to Date data type from String in actual pattern
		
		return date;
	}

	
	@Transactional("myTransactionManager")
	@Override
	public LocalTime timeStamp() throws Exception {
		
		System.out.println("Entering into to time stamp method");
		
		LocalTime localtime = LocalTime.now();
		//String timeformate = localtime.toString();
		
		//System.out.println(timeformate);
		
		//LocalDateTime timestamp = new 
		
		System.out.println(localtime);

		System.out.println("Exiting into to time stamp method");
		return localtime;
	}
	 
}
