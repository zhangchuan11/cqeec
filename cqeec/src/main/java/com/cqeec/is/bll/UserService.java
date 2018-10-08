package com.cqeec.is.bll;

import com.cqeec.is.dml.SystemUser;

public interface UserService {
	public SystemUser login(String user,String password);
}
