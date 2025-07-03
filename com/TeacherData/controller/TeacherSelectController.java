package com.TeacherData.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import com.TeacherData.dao.TeacherSelectDAO;
import com.TeacherData.bean.Teacher;

public class TeacherSelectController {
  public static void main(String[] args) throws SQLException, ClassNotFoundException {

    TeacherSelectDAO teacherSelectDAO = new TeacherSelectDAO();
    ArrayList<Teacher> teachers = teacherSelectDAO.select();
    int counter = 0;
    for (Teacher t : teachers) {
      System.out.println("Entry number " + (++counter));
      System.out.println("ID: " + t.getId());
      System.out.println("Name: " + t.getName());
      System.out.println("Subject: " + t.getSubject());
      System.out.println("Email: " + t.getEmail());
      System.out.println("Password: " + t.getPassword());
      System.out.println();
    }
  }
}
