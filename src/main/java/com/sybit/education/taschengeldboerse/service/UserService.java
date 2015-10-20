package com.sybit.education.taschengeldboerse.service;


import com.sybit.education.taschengeldboerse.model.User;
import java.util.List;

/**
 * Created by stl on 15.06.2015.
 */
public interface UserService {

    List<User> getAllUser();

    User getUserByEmail(String email);
    void addUserToUsers(User user);

}
