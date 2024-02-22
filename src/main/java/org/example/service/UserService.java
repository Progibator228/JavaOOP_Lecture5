package org.example.service;

import org.example.entity.Student;
import org.example.entity.Teacher;
import org.example.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements  DataServise{

    public static List<User> userList = new ArrayList<>();
    @Override
    public void userCreate(User user ) {
        int counterStudent = 0;
        int counterTeacher = 0;
        for (User elem : userList) {
            if (elem instanceof Student){
                counterStudent++;
            }
            else {
                counterTeacher++;
            }
        }
        if ( user instanceof Student){
            ((Student) user).setStudentid(counterStudent+1);
        }
        if ( user instanceof Teacher){
            ((Teacher) user).setTeacherid(counterTeacher+1);
        }
        userList.add(user);

    }

    @Override
    public User userRead(int studentid) {
        for (User user : userList) {
            if (user instanceof Student && ((Student) user).getStudentid().equals(studentid)) {
                return user;
            }
        }
        return null;
    }


}
