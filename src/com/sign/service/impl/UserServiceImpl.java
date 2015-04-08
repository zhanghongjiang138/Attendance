package com.sign.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sign.dao.UserDao;
import com.sign.entity.User;
import com.sign.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	
	@Override
	public void addUser(){
		User user = new User();
		user.setUserName("xiaoxiao");
		userDao.addUser(user);
	}

}
