package com.sybit.education.taschengeldboerse.controller;

import com.sybit.education.taschengeldboerse.domain.Schueler;
import com.sybit.education.taschengeldboerse.service.UserService;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class SchuelerController {
    
    @Autowired
    private UserService userService;

    /**
     * Liste der dem Anbieter alle Bewerber auf.
     *
     * @param request needed to get the referring url
     * @return the logical view to be returned
     */
    @RequestMapping(value = "/anbieter/schueler", method = RequestMethod.GET)
    public String home(final HttpServletRequest request) {

        return "schueler-liste";
    }

    /**
     * Lade das Formular für die Anlage eines Schülers.
     *
     * @param request needed to get the referring url
     * @return the logical view to be returned
     */
    @RequestMapping(value = "/registrieren/schueler", method = RequestMethod.GET)
    public ModelAndView registrierenFormular(final HttpServletRequest request) {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("schueler", new Schueler());

        modelAndView.setViewName("registrieren-schueler");

        return modelAndView;
    }

    /**
     * Speichere neuen Schüler.
     *
     * @param schueler
     * @return the logical view to be returned
     */
    @RequestMapping(value = "/registrieren/schueler", method = RequestMethod.POST)
    public ModelAndView saveForm(@Valid Schueler schueler, BindingResult result) {
           ModelAndView modelAndView = new ModelAndView();
        if(result.hasErrors()) {
            modelAndView.addObject(result.getModel());
            modelAndView.setViewName("registrieren-schueler");
            
        } else { 
            schueler = userService.saveSchueler(schueler);
            modelAndView.addObject("schueler", schueler);

            modelAndView.setViewName("login");
        }
        return modelAndView;
    }
}
