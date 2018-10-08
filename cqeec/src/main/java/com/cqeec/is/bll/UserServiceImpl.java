package com.cqeec.is.bll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cqeec.is.dal.SystemUserMapper;
import com.cqeec.is.dml.SystemUser;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private SystemUserMapper systemUserDao;

	@Override
	public SystemUser login(String user, String password) {
		return systemUserDao.findById(user);
	}

}
