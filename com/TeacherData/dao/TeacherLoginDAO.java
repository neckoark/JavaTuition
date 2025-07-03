package com.TeacherData.dao;

import com.TeacherData.bean.Teacher;

import java.sql.*;

public class TeacherLoginDAO {
    public String login(Teacher teacher) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "root", "kedar2002");
        PreparedStatement pst = con.prepareStatement("select name from teacherdata where email=? && password=?");

        pst.setString(1, teacher.getEmail());
        pst.setString(2, teacher.getPassword());

        ResultSet rs = pst.executeQuery();

        if(rs.next()){
            return rs.getString(1);
        }
        return null;

    }
    public boolean exists(String email) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "root", "kedar2002");
        PreparedStatement pst = con.prepareStatement("select * from teacherdata where email=?");

        pst.setString(1,email);
        ResultSet rs = pst.executeQuery();

        return rs.next();

    }

}
