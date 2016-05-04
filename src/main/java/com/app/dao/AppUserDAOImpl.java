package com.app.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.app.model.AddUser;
import com.app.model.User;

@Repository("appUserDao")
public class AppUserDAOImpl extends AbstractDao<Integer, AddUser> implements AppUserDAO {

	public void saveUser(AddUser user) {
		System.out.println("Entered into DAO of saveUser method");
		//Transaction tx=getSession().beginTransaction();
		
		persist(user);
	}

	@SuppressWarnings("unchecked")
	public List<AddUser> findAllUsers() {
		
		List<AddUser> users=getSession().createQuery("from User").list();
		
		
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

	
	  public AddUser findByFirstname(String firstname){ Criteria criteria =
	  getSession().createCriteria(AddUser.class);
	  criteria.add(Restrictions.eq("firstname",firstname)); return (AddUser)
	  criteria.uniqueResult(); }
	  
	  public void updateUser(AddUser user){
		  
	  getSession().update(user); 
	  
	  }
	 

}