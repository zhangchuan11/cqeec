package com.cqeec.is.dal;

import com.cqeec.is.dml.StudentCourseScore;
import com.cqeec.is.dml.StudentCourseScore2;

public interface StudentCourseScoreMapper {
	public StudentCourseScore findById(String id);
	public StudentCourseScore2 findById2(String id);
}
