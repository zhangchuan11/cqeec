package com.cqeec.is.dal;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.cqeec.is.dml.Tutor;
import com.cqeec.is.dml.TutorCourse;

public interface TutorMapper {
	@Select("SELECT * FROM TutorCourse WHERE tutor_id=#{id}")
	public List<TutorCourse> findTutorCourseById(String id);

	@Select("SELECT * FROM Tutor WHERE id=#{id}")
	@Results({ @Result(id = true, property = "id", column = "id"), @Result(property = "name", column = "name"),
			@Result(property = "tutorCourse", column = "id", many = @Many(select = "com.cqeec.is.dal.TutorMapper.findTutorCourseById")) })
	public Tutor findById(String id);
}
