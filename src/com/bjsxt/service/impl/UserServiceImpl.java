package com.bjsxt.service.impl;

import java.util.List;

import com.bjsxt.dao.UserDao;
import com.bjsxt.pojo.User;
import com.bjsxt.service.UserService;

/**
 * @author:jwzhang
 * @date:2017年9月4日下午1:20:26
 */
public class UserServiceImpl implements UserService {

	private UserDao userDaoImpl;
	
	public void setUserDaoImpl(UserDao userDaoImpl) {
		this.userDaoImpl = userDaoImpl;
	}

	@Override
	public List<User> fingAll() {
		return userDaoImpl.fingAll();
	}

}
