package com.sybit.education.taschengeldboerse.controller.admin;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



/**
 * Handles requests for the application home page.
 */
@Controller
public class AdminHomeController {

   /**
    * Simply selects the home view to render by returning its name.
    *
    * @param request needed to get the referring url
    * @return the logical view to be returned
    */
   @RequestMapping(value = "/admin", method = RequestMethod.GET)
   public String home( final HttpServletRequest request) {
     
      return "admin/home";
   }
}