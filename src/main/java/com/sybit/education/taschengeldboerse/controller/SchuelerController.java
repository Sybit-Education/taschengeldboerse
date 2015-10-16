package com.sybit.education.taschengeldboerse.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



/**
 * Handles requests for the application home page.
 */
@Controller
public class SchuelerController {

   /**
    * Simply selects the home view to render by returning its name.
    *
    * @param request needed to get the referring url
    * @return the logical view to be returned
    */
   @RequestMapping(value = "/schueler", method = RequestMethod.GET)
   public String home( final HttpServletRequest request) {
     
      return "schueler-liste";
   }
   
   
   /**
    * Lade das Formular für die Anlage eines Schülers.
    *
    * @param request needed to get the referring url
    * @return the logical view to be returned
    */
   @RequestMapping(value = "/schueler/neu", method = RequestMethod.GET)
   public String addForm( final HttpServletRequest request) {
     
      return "schueler-neu";
   }
   
   /**
    * Speichere neuen Schüler.
    *
    * @param request needed to get the referring url
    * @return the logical view to be returned
    */
   @RequestMapping(value = "/schueler/neu", method = RequestMethod.POST)
   public String saveForm( final HttpServletRequest request) {
       System.out.println("com.sybit.education.taschengeldboerse.controller.SchuelerController.saveForm()");
      return "schueler-neu";
   }   
}