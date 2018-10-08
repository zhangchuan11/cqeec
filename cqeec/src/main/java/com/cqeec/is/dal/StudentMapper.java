package com.cqeec.is.dal;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.mapping.FetchType;

import com.cqeec.is.dml.Address;
import com.cqeec.is.dml.Student;

public interface StudentMapper {
	@SelectProvider(type = StudentSqlProvider.class, method = "findById2")
	public Student findStudentById(String id);
	
	@Insert("INSERT INTO Student VALUES(#{id},#{number},#{name},#{address.id})")
	public void insertStudent(Student s);

	@Select("SELECT * FROM Address WHERE id=#{id}")
	public Address findById(String id);

	@Select("SELECT * FROM Student")
	public List<Student> findAll();

	@Select("SELECT * FROM Student")
	@Results({ @Result(id = true, property = "id", column = "id"), @Result(property = "number", column = "number"),
			@Result(property = "name", column = "name"),
			@Result(property = "address", column = "address", one = @One(fetchType = FetchType.LAZY, select = "com.cqeec.is.dal.StudentMapper.findById")) })
	public List<Student> findAll3();

	@Select("SELECT S.id,S.number,S.name,S.address,A.country,A.city FROM Student AS S INNER JOIN Address AS A ON S.address=A.id")
	@Results({ @Result(id = true, property = "id", column = "id"), @Result(property = "number", column = "number"),
			@Result(property = "name", column = "name"), @Result(property = "address.id", column = "address"),
			@Result(property = "address.country", column = "country"),
			@Result(property = "address.city", column = "city") })
	public List<Student> findAll2();

	@InsertProvider(type = StudentSqlProvider.class, method = "insert")
	public void insert(Student s);
}
