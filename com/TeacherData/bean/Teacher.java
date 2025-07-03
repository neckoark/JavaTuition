package com.TeacherData.bean;

public class Teacher {

    public Teacher(int id,String name, String subject, String email, String password) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.email = email;
        this.password = password;
    }


    public Teacher() {

    }

    private String name;
    private int id;
    private String subject;
    private String email;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
