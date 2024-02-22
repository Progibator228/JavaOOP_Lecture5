package org.example.service;

import org.example.entity.User;

public interface DataServise {

    void userCreate(User user);
    User userRead(int studentid);
}
