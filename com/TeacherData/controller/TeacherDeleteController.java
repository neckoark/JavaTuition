package com.TeacherData.controller;

import com.TeacherData.bean.Teacher;
import com.TeacherData.dao.TeacherDeleteDAO;

import java.sql.SQLException;
import java.util.Scanner;

public class TeacherDeleteController {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        TeacherDeleteDAO teacherDeleteDAO = new TeacherDeleteDAO();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID to delete");

        int id = sc.nextInt();

        if(!teacherDeleteDAO.exists(id)){
            System.out.println("ID does not exist");
            System.exit(0);
        }

        Teacher teacher = new Teacher();
        teacher.setId(id);

        if(teacherDeleteDAO.delete(teacher)) System.out.println("ID Deleted");
        else System.out.println("ID not deleted");
     }
}
