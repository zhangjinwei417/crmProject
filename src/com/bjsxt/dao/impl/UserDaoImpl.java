package com.bjsxt.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bjsxt.dao.UserDao;
import com.bjsxt.pojo.User;

/**
 * @author:jwzhang
 * @date:2017年9月4日下午1:15:48
 */
public class UserDaoImpl implements UserDao {
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<User> fingAll() {
		Session session = sessionFactory.openSession();
		List<User> list = session.createQuery("from User order by id").list();
		return list;
	}

}
