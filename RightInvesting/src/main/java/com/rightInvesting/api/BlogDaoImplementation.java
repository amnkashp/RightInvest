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
	public List<Blog> getBlogNew(String Tittle) {
	
		List<Blog> blogscontent;
		
		Session currentSession = sessionfactory.getCurrentSession();
		
		String sql = "From Blog Where blogtittle Like '"+Tittle+"'";
		Query query = currentSession.createQuery(sql);
		
		blogscontent = query.list();
		
		return blogscontent;
	}

}
