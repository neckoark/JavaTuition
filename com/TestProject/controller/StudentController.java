package com.TestProject.controller;

import com.TestProject.bean.Student;
import com.TestProject.dao.StudentDAO;

public class StudentController {

	public static void main(String[] args) {
		Student student = new Student();
		student.setRollno(1);
		student.setEmail("student@gmail.com");
		student.setCity("New York");
		student.setGender("Male");
		student.setName("John Doe");
		student.setAge(1);


		StudentDAO studentDAO = new StudentDAO();
		studentDAO.show(student);
	}
}
