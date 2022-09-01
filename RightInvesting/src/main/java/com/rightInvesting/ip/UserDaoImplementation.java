package com.rightInvesting.ip;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImplementation implements UserDao {

	@Autowired
	SessionFactory sessionfactory;

	
	  @Override
	  public void doSaveUser(User user) throws HibernateException {
	  
		  System.out.println("reached session factory");
		  
		  Session currentSession =  sessionfactory.getCurrentSession();
		  
		  currentSession.saveOrUpdate(user);
		  
		  System.out.println("updated in database");
		  //currentSession.close();
		  
	/* * // Session currentSession = new sessionFactory.getCurrentSession();
	 * 
	 * // currentSession.saveOrUpdate(user);
	 * 
	 * // Session currentSession = new sessionFactory.getCurrentSession();
	 */ 
	 // Session currentSession = new sessionfactory.getCurrentSession(); }
	 
}
}
