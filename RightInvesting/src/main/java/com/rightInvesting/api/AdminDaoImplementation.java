
package com.rightInvesting.api;
  
  import java.util.ArrayList;
import java.util.List;
  
  import org.hibernate.Query; 
  import org.hibernate.Session; 
  import org.hibernate.SessionFactory; 
  import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.GsonFactoryBean;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.stereotype.Repository;
  
  import com.rightInvesting.ip.User;
  
  @Repository 
  public class AdminDaoImplementation implements AdminDao {
  
  @Autowired 
  SessionFactory sessionFactory;
  
  List<User> leads;
  
  @Override 
  public List<User> getUserList() {
  
  Session currentSession = sessionFactory.getCurrentSession();
  
  String sqlquery = "From User"; 
  Query query = currentSession.createQuery(sqlquery); 
  leads = query.list(); 
  return leads; }

	//@SuppressWarnings("unchecked")
	@Override
	public User getUser(Integer userid) {

			System.out.println("started dao implementation ");
			Integer uid = userid;
		
			
			Session currentSession = sessionFactory.getCurrentSession();
				
			User user = currentSession.get(User.class, uid);
	
			 return user;
}
  
  }
 