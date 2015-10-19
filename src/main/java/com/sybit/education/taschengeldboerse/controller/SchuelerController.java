package com.sybit.education.taschengeldboerse.controller;


import com.sun.deploy.uitoolkit.impl.fx.ui.resources.ResourceManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.PageContext;
import javax.swing.UIManager;
import javax.ws.rs.HttpMethod;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
   public String saveForm(@ModelAttribute("vorname") String vorname, final Model model,  final HttpServletRequest request) {
       
       System.out.println("Vorname: " + vorname);
      return "schueler-neu";
   }   
}