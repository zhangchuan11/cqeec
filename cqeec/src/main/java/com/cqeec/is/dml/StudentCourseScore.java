package com.cqeec.is.dml;

public class StudentCourseScore {
	private String id;
	private String student;
	private String studentName;
	private String course;
	private String courseName;
	private String score;

	public void print() {
		System.out.println("标识：" + id + "学生：" + studentName + "课程：" + courseName + "成绩：" + score);
	}

	public StudentCourseScore() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
