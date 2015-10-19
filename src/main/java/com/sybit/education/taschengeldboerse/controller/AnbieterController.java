package com.sybit.education.taschengeldboerse.controller;


import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



/**
 * Handles requests for the application home page.
 */
@Controller
public class AnbieterController {

    private static final Logger logger = LoggerFactory.getLogger(AnbieterController.class);


   
    /**
    * Simply selects the home view to render by returning its name.
    *
    * @param request needed to get the referring url
    * @return the logical view to be returned
    */
   @RequestMapping(value = "/registrieren/anbieter", method = RequestMethod.GET)
   public String login( final HttpServletRequest request) {
     
      return "registrieren-anbieter";
   }
   

}