package com.TeacherData.dao;

import com.TeacherData.bean.Teacher;

import java.sql.*;
import java.util.ArrayList;

public class TeacherSelectDAO {
    public ArrayList<Teacher> select() throws SQLException, ClassNotFoundException {
        ArrayList<Teacher> teacherList = new ArrayList<>();

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student_db", "root", "kedar2002"
        );
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM teacherdata");

        while (rs.next()) {
            teacherList.add(new Teacher(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5) ));
        }
        return teacherList;
    }
}
