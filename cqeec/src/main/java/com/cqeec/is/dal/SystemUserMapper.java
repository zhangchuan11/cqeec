package com.cqeec.is.dal;

import java.util.List;
import java.util.Map;

import com.cqeec.is.dml.SystemUser;

public interface SystemUserMapper {
	public SystemUser findById(String id);
	
	public List<SystemUser> query(SystemUser su);

	public List<SystemUser> findAll();

	public int insert(SystemUser su);
	
	public void batchInsert(List<SystemUser> lists);

	public void register(SystemUser su);

	public void insertDS(SystemUser su);
	
	public void update(SystemUser su);

	public void updatePassword(String id, String password);

	public void updatePassword2(Map<String, Object> param);

	public void updatePassword3(List<Object> param);
	
	public void deleteById(String id);
}
