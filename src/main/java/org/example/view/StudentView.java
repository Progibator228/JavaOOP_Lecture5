package org.example.view;

import org.example.entity.Student;
import org.example.entity.StudyGroup;
import org.example.entity.User;

public class StudentView {



    public void print(StudyGroup studyGroup) {
        for (Object o : studyGroup.studentList) {
            System.out.println("((Student) o).getStudentid() = " + ((Student) o).getStudentid());
        }
        System.out.println("studyGroup.teacher.getTeacherid() = " + studyGroup.teacher.getTeacherid());
    }
  }

