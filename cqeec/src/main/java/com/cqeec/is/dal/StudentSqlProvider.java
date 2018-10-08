package com.cqeec.is.dal;

import org.apache.ibatis.jdbc.SQL;

import com.cqeec.is.dml.Student;

public class StudentSqlProvider {
	public String insert(Student s) {
		return new SQL() {
			{
				INSERT_INTO("Student");
				VALUES("id", "#{id}");
				if (s.getName() != null) {
					VALUES("name", "#{name}");
				}
				if (s.getNumber() != null) {
					VALUES("number", "#{number}");
				}
			}
		}.toString();
	}

	public String findById(String id) {
		return "SELECT * FROM Student WHERE id='" + id + "'";
	}

	public String findById2() {
		return new SQL() {
			{
				SELECT("*");
				FROM("Student");
				WHERE("id=#{id}");
			}
		}.toString();
	}
}
