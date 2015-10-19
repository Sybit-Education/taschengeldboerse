package com.sybit.education.taschengeldboerse.service;



import com.sybit.education.taschengeldboerse.model.User;
import com.sybit.education.taschengeldboerse.repository.IUserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;


/**
 * Created by stl on 09.06.2015.
 */

@Service
//@ImportResource("classpath:/spring/spring-context.xml")
public class UserServiceImpl implements IUserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private IUserRepository ur;


    @Override
    public List<User> getAllUser() {
        return ur.findAll();
    }


    /**
     *
     * @param email
     * @return unique user
     */
    @Override
    public User getUserByEmail(String email) {
        List<User> users = ur.findByEmail(email);

        if(users.size()>0) {
            return users.get(0);
        } else {
            return null;
        }
    }

    /**
     *
     * @param user
     *
     * adds user to database
     */
    @Override
    public void addUserToUsers(User user) {
        ur.save(user);
    }

  
}
