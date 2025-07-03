package com.TeacherData.controller;

import com.TeacherData.bean.Teacher;
import com.TeacherData.dao.TeacherInsertDAO;

import java.sql.*;
import java.util.Scanner;

public class TeacherInsertController {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID: ");
        int id = sc.nextInt();

        System.out.println("Enter Name: ");
        String name = sc.next();

        System.out.println("Enter Subject: ");
        String city = sc.next();

        System.out.println("Enter email: ");
        String email = sc.next();

        System.out.println("Enter password: ");
        String password = sc.next();

        Teacher teacher = new Teacher();
        teacher.setId(id);
        teacher.setName(name);
        teacher.setSubject(city);
        teacher.setEmail(email);
        teacher.setPassword(password);

        TeacherInsertDAO teacherInsertDAO = new TeacherInsertDAO();
        if (teacherInsertDAO.insert(teacher)) System.out.println("Inserted Successfully");
        else System.out.println("Not inserted successfully");

    }
}
