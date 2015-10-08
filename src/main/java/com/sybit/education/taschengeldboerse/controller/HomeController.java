package com.sybit.education.taschengeldboerse.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

   /**
    * Simply selects the home view to render by returning its name.
    *
    * @param request needed to get the referring url
    * @return the logical view to be returned
    */
   @RequestMapping(value = "/", method = RequestMethod.GET)
   public String home( final HttpServletRequest request) {
     
      return "home";
   }
   
   /**
    * Simply selects the view to render by returning its name.
    *
    * @param request needed to get the referring url
    * @return the logical view to be returned
    */
   @RequestMapping(value = "/impressum", method = RequestMethod.GET)
   public String impressum( final HttpServletRequest request) {
     
      return "impressum";
   }   
}