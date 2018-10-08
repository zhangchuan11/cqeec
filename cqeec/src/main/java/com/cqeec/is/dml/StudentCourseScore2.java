package com.cqeec.is.dml;

public class StudentCourseScore2 {
	private String id;
	private Student student;
	private Course course;
	private String score;

	public void print() {
		System.out.println("标识：" + id + "\t学生：" + student.getNumber() + " " + student.getName() + "\t课程："
				+ course.getCode() + " " + course.getName() + "\t成绩：" + score);
	}

	public StudentCourseScore2() {
		System.out.println("创建对象------------------------------");
	}

	
	public StudentCourseScore2(String id) {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

}
