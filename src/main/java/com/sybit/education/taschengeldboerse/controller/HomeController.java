package com.sybit.education.taschengeldboerse.controller;

import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
    
    /**
     * <code>LOGGER</code> creates an instance of a Log4J Logger class.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);    

    /**
     * Simply selects the home view to render by returning its name.
     *
     * @param request needed to get the referring url
     * @return the logical view to be returned
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(final HttpServletRequest request) {

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username = auth.getName();

        if (username == null) {
            LOGGER.warn("username is null!");
            username = "anonymous";
        }
        
        LOGGER.debug("User= " + username );

        return "home";
    }

    /**
     * Simply selects the view to render by returning its name.
     *
     * @param request needed to get the referring url
     * @return the logical view to be returned
     */
    @RequestMapping(value = "/impressum", method = RequestMethod.GET)
    public String impressum(final HttpServletRequest request) {

        return "impressum";
    }

    /**
     * Simply selects the view to render by returning its name.
     *
     * @param request needed to get the referring url
     * @return the logical view to be returned
     */
    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about(final HttpServletRequest request) {

        return "about";
    }
}
