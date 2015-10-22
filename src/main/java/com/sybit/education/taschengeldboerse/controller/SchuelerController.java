package com.sybit.education.taschengeldboerse.controller;

import com.sybit.education.taschengeldboerse.domain.Schueler;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class SchuelerController {

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
     * @param model
     * @param request needed to get the referring url
     * @return the logical view to be returned
     */
    @RequestMapping(value = "/registrieren/schueler", method = RequestMethod.POST)
    public ModelAndView saveForm(@ModelAttribute("schueler") Schueler schueler, final Model model, final HttpServletRequest request) {

        System.out.println("Vorname: " + schueler.getVorname());
        
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("schueler", schueler);

        modelAndView.setViewName("registrieren-schueler");

        return modelAndView;
    }
}
