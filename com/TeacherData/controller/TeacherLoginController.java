package com.TeacherData.controller;

import com.TeacherData.bean.Teacher;
import com.TeacherData.dao.TeacherLoginDAO;
import java.sql.*;
import java.util.Scanner;

public class TeacherLoginController {
  public static void main(String[] args) throws SQLException, ClassNotFoundException {

    TeacherLoginDAO teacherLoginDAO = new TeacherLoginDAO();

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter email");
    String email = sc.next();

    if (!teacherLoginDAO.exists(email)) {
      System.out.println("Email doesnt exists");
      System.exit(0);
    }

    System.out.println("Enter password");
    String password = sc.next();

    Teacher teacher = new Teacher();
    teacher.setEmail(email);
    teacher.setPassword(password);

    String username = teacherLoginDAO.login(teacher);
    if (username != null) {
      System.out.println("Login successfully");
      System.out.println(username);
    } else
      System.out.println("Wrong password");

  }
}
