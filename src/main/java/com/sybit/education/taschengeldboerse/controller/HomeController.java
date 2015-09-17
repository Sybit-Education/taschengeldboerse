package com.sybit.education.taschengeldboerse.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.enterprise.inject.Model;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

 
   
   

   /**
    * Simply selects the home view to render by returning its name.
    *
    * @param model the model to be built
    * @param request needed to get the referring url
    * @return the logical view to be returned
    */
   @RequestMapping(value = "/", method = RequestMethod.GET)
   public String home(final Model model, final HttpServletRequest request) {
     
      return "home";
   }
}