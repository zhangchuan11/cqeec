package com.cqeec.is.dml;

import java.util.List;

public class Tutor {
	private String id;
	private String name;

	private List<TutorCourse> tutorCourse;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<TutorCourse> getTutorCourse() {
		return tutorCourse;
	}

	public void setTutorCourse(List<TutorCourse> tutorCourse) {
		this.tutorCourse = tutorCourse;
	}

}
