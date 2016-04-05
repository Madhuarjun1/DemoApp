package com.app.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.app.model.User;

@Repository("userDao")
public class UserDAOImpl extends AbstractDAO implements UserDAO {

	public void saveUser(User user) {
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

	public void deleteUser(String id) {
		Query query = getSession().createSQLQuery(
				"delete from DEMO_USER where id = :id");
		query.setString("id", id);
		query.executeUpdate();
	}

	/*
	 * public User findBySsn(String ssn){ Criteria criteria =
	 * getSession().createCriteria(User.class);
	 * criteria.add(Restrictions.eq("ssn",ssn)); return (User)
	 * criteria.uniqueResult(); }
	 * 
	 * public void updateEmployee(User user){
	 * getSession().update(user); }
	 */

}