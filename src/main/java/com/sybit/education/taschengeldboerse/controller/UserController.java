package com.sybit.education.taschengeldboerse.controller;

import com.sybit.education.taschengeldboerse.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.sybit.education.taschengeldboerse.service.UserService;

/**
 * Created by stl on 08.06.2015.
 */


@Controller
public class UserController {

    @Qualifier("userServiceImpl")
    @Autowired
    private UserService userService;

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);


}
