package com.app.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.app.model.User;

@Repository("userDao")
public class UserDAOImpl extends AbstractDAO implements UserDAO {

	public void saveUser(User user) {
		System.out.println("Entered into DAO of saveUser method");
		//Transaction tx=getSession().beginTransaction();
		
		persist(user);
	}

	@SuppressWarnings("unchecked")
	public List<User> findAllUsers() {
		
		List<User> users=getSession().createQuery("from User").list();
		
		
		/*Criteria criteria = getSession().createCriteria(User.class);
		System.out.println("findAllUsers() in UserDAOImpl class");
		return (List<User>) criteria.list();*/
		return users;
	}

	public void deleteUser(Integer id) {
		Query query = getSession().createSQLQuery(
				"delete from DEMO_USER where id = :id");
		query.setInteger("id", id);
		query.executeUpdate();
	}

	
	  public User findByFirstname(String firstname){ Criteria criteria =
	  getSession().createCriteria(User.class);
	  criteria.add(Restrictions.eq("firstname",firstname)); return (User)
	  criteria.uniqueResult(); }
	  
	  public void updateUser(User user){
		  
	  getSession().update(user); 
	  
	  }
	 

}