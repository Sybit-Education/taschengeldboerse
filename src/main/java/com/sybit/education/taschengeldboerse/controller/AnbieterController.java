package com.sybit.education.taschengeldboerse.controller;


import com.sybit.education.taschengeldboerse.domain.Anbieter;
import model.Bewertung;
import com.sybit.education.taschengeldboerse.service.AnbieterService;
import com.sybit.education.taschengeldboerse.service.UserService;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



/**
 * Handles requests for the application home page.
 */
@Controller
public class AnbieterController {

    private static final Logger logger = LoggerFactory.getLogger(AnbieterController.class);

    
    @Autowired
    private UserService userService;
    
    @Autowired
    private  AnbieterService anbieterService;
   
    /**
    * Simply selects the home view to render by returning its name.
    *
    * @param request needed to get the referring url
    * @return the logical view to be returned
    */
   /*@RequestMapping(value = "/anbieter/schueler", method = RequestMethod.GET)
   public String home( final HttpServletRequest request) {
     
      return "registrieren-anbieter";
   }*/
   
       /**
     * Lade das Formular für die Anlage eines Schülers.
     *
     * @param request needed to get the referring url
     * @return the logical view to be returned
     */
    @RequestMapping(value = "/registrieren/anbieter", method = RequestMethod.GET)
    public ModelAndView registrierenFormular(final HttpServletRequest request) {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("anbieter", new Anbieter());

        modelAndView.setViewName("registrieren-anbieter");

        return modelAndView;
    }
   
    /**
     * Speichere neuen Anbieter.
     *
     * @param anbieter
     * @return the logical view to be returned
     */
    @RequestMapping(value = "/registrieren/anbieter", method = RequestMethod.POST)
    public ModelAndView saveForm(@Valid Anbieter anbieter, BindingResult result) {
           ModelAndView modelAndView = new ModelAndView();
        if(result.hasErrors()) {
            modelAndView.addObject(result.getModel());
            modelAndView.setViewName("registrieren-anbieter");
            
        } else { 
            anbieter = userService.saveAnbieter(anbieter);
            modelAndView.addObject("anbieter", anbieter);
            modelAndView.setViewName("/login");
            
        } 
        return modelAndView;
    }
    
    
    @RequestMapping(value = "/userlist/alleAnbieter", method = RequestMethod.GET)
    public ModelAndView anbieterListe(final HttpServletRequest request) {
        
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("anbieterListe", anbieterService.getAll());
        

        modelAndView.setViewName("anbieterListe");

        return modelAndView;
        
        
    }
        
    
    
    
    @RequestMapping(value = "/schueler/anbieterBewertung", method = RequestMethod.GET)
    public ModelAndView getAnbieterDetail(@RequestParam("id") final Integer id, final HttpServletResponse response) throws IOException {
        ModelAndView modelAndView = new ModelAndView();
        
        Anbieter anbieter = anbieterService.findById(id);
        
        
        modelAndView.addObject("anbieter", anbieter);
        modelAndView.setViewName("anbieter-bewerten");
        modelAndView.addObject("bewertung", new Bewertung()); 
        
        return modelAndView;

    }

    @RequestMapping(value = "/schueler/danksagungFuerBewertung", method = RequestMethod.POST)
    public ModelAndView danksagungFuerBewertung(@Valid Bewertung bewertung, BindingResult result, @RequestParam("id") final Integer id) {
        
        ModelAndView modelAndView = new ModelAndView();
        Anbieter anbieter = anbieterService.findById(id);
        Integer anzahl = anbieter.getAnzahlBewertungen();
        anzahl = anzahl + 1;
        
        
        
        anbieter.setAnzahlBewertungen(anzahl);
        anbieter.setBewertungspunkteInsgesammt(anbieter.getBewertungspunkteInsgesammt() + bewertung.getBewertungsZahl());
        
        userService.saveAnbieterNachBewertung(anbieter);
               
        modelAndView.addObject("anbieter", anbieter);
        modelAndView.setViewName("danksagung-Bewertung");
        
        return modelAndView;

    }
}
