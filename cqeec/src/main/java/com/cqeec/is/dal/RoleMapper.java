package com.cqeec.is.dal;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.cqeec.is.dml.Role;

public interface RoleMapper {
	@Select("SELECT * FROM Role WHERE id=#{id}")
	public Role findById(String id);
	
	@Select("SELECT * FROM Role")
	public List<Role> findAll();
}
