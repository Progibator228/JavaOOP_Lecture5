package org.example.service;

import org.example.entity.Student;
import org.example.entity.StudyGroup;
import org.example.entity.Teacher;
import org.example.entity.User;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupFormation {


    public static StudyGroup formatGroup(Teacher teacher, List<User> studentList){
        List<User> result = new ArrayList<>();
        for (User user : studentList) {
            if (user instanceof Student){
                result.add(user);
            }
        }
        return new StudyGroup (teacher , result);
    }
}
