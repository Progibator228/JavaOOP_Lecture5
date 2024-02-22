package org.example.entity;

import java.util.List;

public class StudyGroup <T>{


    public Teacher teacher;
    public List<T> studentList;

    public StudyGroup(Teacher teacher, List<T> studentList) {
        this.teacher = teacher;
        this.studentList =  studentList;
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "teacher=" + teacher +
                ", studentList=" + studentList +
                '}';
    }
}
