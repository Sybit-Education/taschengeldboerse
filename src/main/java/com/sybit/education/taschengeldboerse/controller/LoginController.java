/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package com.sybit.education.taschengeldboerse.controller;

import com.sybit.education.taschengeldboerse.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controler to manage Login.
 *
 * @author ssr
 */
@Controller
public class LoginController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    /**
     * Mapping to get specific Login-dialog.
     *
     * @return returns the login view.
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String openLoginForm(User user, Model model) {
        LOGGER.debug(user.getEmail());

        return "login";
    }
}
