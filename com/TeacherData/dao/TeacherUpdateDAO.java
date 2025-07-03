package com.TeacherData.dao;

import com.TeacherData.bean.Teacher;

import java.sql.*;

public class TeacherUpdateDAO {
    public boolean update(Teacher teacher) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "root", "kedar2002");
        PreparedStatement pst = con.prepareStatement("update teacherdata set name=? where id=?");

        pst.setString(1, teacher.getName());
        pst.setInt(2, teacher.getId());

        int result = pst.executeUpdate();
        return result > 0;
    }


    public boolean exists(int id) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "root", "kedar2002");
        PreparedStatement pst = con.prepareStatement("SELECT id FROM teacherdata WHERE id = ?");

        pst.setInt(1,id);

        ResultSet rs = pst.executeQuery();

        return rs.next();
    }
}
