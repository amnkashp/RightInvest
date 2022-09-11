package com.rightInvesting.api;



import java.sql.ResultSet;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateQueryException;
import org.springframework.stereotype.Repository;

@Repository
public class BlogDaoImplementation implements BlogDao{
	
	
	
	@Autowired
	SessionFactory sessionfactory;
	
	
	
	@Override
	public Blog getBlog() throws HibernateQueryException{
		List<String> blogscontent;
		System.out.println("entered in the Blog Implementation method ");
		Session currentSession = sessionfactory.getCurrentSession();
		String sql = "From Blog Where blogtittle Like 'test'";
		Query query = currentSession.createQuery(sql);
		System.out.println("Here is the query result " +query);
		blogscontent = query.list();
		System.out.println("Result of Query in List form " +blogscontent);
		
		
		
		return null;
	}

}
