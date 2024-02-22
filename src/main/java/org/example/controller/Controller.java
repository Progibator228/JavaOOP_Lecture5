package org.example.controller;

import org.example.entity.Student;
import org.example.entity.StudyGroup;
import org.example.entity.Teacher;
import org.example.entity.User;
import org.example.service.StudyGroupFormation;
import org.example.service.UserService;
import org.example.view.StudentView;

import static org.example.service.UserService.userList;

public class Controller {

    private UserService service;
    private StudyGroupFormation serviceGF;
    private StudentView view;

    public Controller() {
        service = new UserService();
        view = new StudentView();
    }

    public void run (){
        User user1 = new Student("22 Февраля","Стасян",10);
        Student user2 = new Student("99 Декабря","Васян",100);
        Teacher teacher1 = new Teacher("30 Марта", "Валерчик",1000);
        service.userCreate(user1);
        service.userCreate(user2);
        service.userCreate(teacher1);

        StudyGroup studyGroup =  StudyGroupFormation.formatGroup(teacher1,UserService.userList);
        System.out.println("studyGroup = " + studyGroup);

        view.print(studyGroup);





    }
}
