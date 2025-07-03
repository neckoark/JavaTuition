package com.TeacherData.dao;

import com.TeacherData.bean.Teacher;

import java.sql.*;

public class TeacherInsertDAO {
  public boolean insert(Teacher teacher) throws ClassNotFoundException, SQLException {

    Class.forName("com.mysql.cj.jdbc.Driver");

    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "root", "kedar2002");

    PreparedStatement pst = con
        .prepareStatement("insert into teacherdata (id,name,subject,email,password) values(?,?,?,?,?)");

    pst.setInt(1, teacher.getId());
    pst.setString(2, teacher.getName());
    pst.setString(3, teacher.getSubject());
    pst.setString(4, teacher.getEmail());
    pst.setString(5, teacher.getPassword());

    int result = pst.executeUpdate();
    return result > 0;
  }

}
