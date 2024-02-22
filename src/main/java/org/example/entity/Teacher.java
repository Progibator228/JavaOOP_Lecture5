package org.example.entity;

import org.example.entity.User;

public class Teacher extends User {
    private Integer teacherid;


    public Teacher(String birthday, String fullname , Integer teacherid) {
        super(birthday, fullname);
        this.teacherid = teacherid;
    }

    public Integer getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(Integer teacherid) {
        this.teacherid = teacherid;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherid=" + teacherid +
                ", birthday='" + birthday + '\'' +
                ", fullname='" + fullname + '\'' +
                '}';
    }
}
