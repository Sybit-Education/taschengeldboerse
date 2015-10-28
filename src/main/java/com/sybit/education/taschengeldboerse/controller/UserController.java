package com.sybit.education.taschengeldboerse.controller;

import com.sybit.education.taschengeldboerse.domain.Anbieter;
import com.sybit.education.taschengeldboerse.domain.Schueler;
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
import javax.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by stl on 08.06.2015.
 */
@Controller
public class UserController {

    @Qualifier("userServiceImpl")
    @Autowired
    private UserService userService;

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    /**
     * Registierformular öffnen.
     *
     * @return returns the login view.
     */
    @RequestMapping(value = "/registrieren", method = RequestMethod.GET)
    public ModelAndView openRegisterForm(@ModelAttribute("user") User user, Model model) {
        LOGGER.debug("openRegisterForm ->");

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user", user);

        modelAndView.setViewName("registrieren-1");

        LOGGER.debug("openRegisterForm <-");
        return modelAndView;
    }

    /**
     * Save the user.
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "/registrieren", method = RequestMethod.POST)
    public ModelAndView sendRegisterForm(@Valid User user, BindingResult result) {
        ModelAndView modelAndView;

        if (result.hasErrors()) {
            modelAndView = new ModelAndView();
            modelAndView.addObject(result.getModel());
            modelAndView.setViewName("registrieren-1");
        } else {
            try {
                modelAndView = new ModelAndView();
                userService.addUser(user);

                modelAndView.addObject("user", user);
                modelAndView.addObject("error", "");
                modelAndView.setViewName("registrieren-2-next");

            } catch (IllegalArgumentException e) {

                //noch mal probieren...
                modelAndView = new ModelAndView();
                modelAndView.addObject("error", "E-Mail schon vergeben!");
                modelAndView.setViewName("registrieren-1");
            }
        }
        return modelAndView;
    }

    /**
     * Save the user.
     *
     * @param user
     * @param model
     * @return
     */
    @RequestMapping(value = "/registrieren-2-next", method = RequestMethod.POST)
    public ModelAndView updateAuthority(User user, Model model) {

        user = userService.updateAuthority(user);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user", user);

        switch (user.getAuthority()) {
            case "ROLE_SCHUELER":
                Schueler schueler = new Schueler(user);
                modelAndView.addObject("schueler", schueler);
                modelAndView.setViewName("registrieren-schueler");
                break;
            case "ROLE_ANBIETER":
                Anbieter anbieter = new Anbieter(user);
                modelAndView.addObject("anbieter", anbieter);
                modelAndView.setViewName("registrieren-anbieter");
                break;
            default:
                throw new IllegalArgumentException("Falsche Rolle: " + user.getAuthority());
        }

        return modelAndView;
    }
}
