package com.TestProject.dao;

import com.TestProject.bean.Student;

public class StudentDAO {
	public void show(Student student) {
		System.out.println(student.getAge());
		System.out.println(student.getGender());
		System.out.println(student.getName());
		System.out.println(student.getEmail());
		System.out.println(student.getCity());
	}
}
