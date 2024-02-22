package org.example.entity;

import org.example.entity.User;

public class Student extends User {

    public Integer studentid;

    public Student(String birthday, String fullname, Integer studentid) {
        super(birthday, fullname);
        this.studentid = studentid;
    }


    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentid=" + studentid +
                ", birthday='" + birthday + '\'' +
                ", fullname='" + fullname + '\'' +
                '}';
    }
}



