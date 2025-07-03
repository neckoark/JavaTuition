package com.TeacherData.controller;


import com.TeacherData.bean.Teacher;
import com.TeacherData.dao.TeacherUpdateDAO;
import java.sql.SQLException;
import java.util.Scanner;


public class TeacherUpdateController {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        TeacherUpdateDAO teacherUpdateDAO = new TeacherUpdateDAO();


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID to change name: ");
        int id = sc.nextInt();

        if(!teacherUpdateDAO.exists(id)){
            System.out.println("ID does not exist");
            System.exit(0);
        }

        System.out.println("Enter new name: ");
        String name = sc.next();

        Teacher teacher = new Teacher();
        teacher.setId(id);
        teacher.setName(name);


        if(teacherUpdateDAO.update(teacher)) System.out.println("Updated successfully");
        else System.out.println("Not updated try again");
    }
}
