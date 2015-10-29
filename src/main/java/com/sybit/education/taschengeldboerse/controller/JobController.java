package com.sybit.education.taschengeldboerse.controller;

import com.sybit.education.taschengeldboerse.domain.Anbieter;
import com.sybit.education.taschengeldboerse.domain.Job;
import com.sybit.education.taschengeldboerse.domain.Schueler;
import com.sybit.education.taschengeldboerse.service.AnbieterService;
import com.sybit.education.taschengeldboerse.service.JobsService;
import com.sybit.education.taschengeldboerse.service.SchuelerService;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class JobController {

    private static final Logger logger = LoggerFactory.getLogger(JobController.class);

    @Autowired
    private JobsService jobService;

    @Autowired
    private AnbieterService anbieterService;
    
    @Autowired
    private SchuelerService schuelerService;

    /**
     * Liste für die Schüler alle offenen Jobs auf.
     *
     * @param model
     * @param request
     * @return
     */
    @RequestMapping(value = "/schueler/jobs", method = RequestMethod.GET)
    public String jobList(final Model model, final HttpServletRequest request) {
        logger.debug("All Jobs---->");
        final List<Job> jobList = jobService.findAllByOrderByErstelldatumDescWhereSchuelerIsNull();
        model.addAttribute("jobList", jobList);
        logger.debug("All Jobs <------");
        return "job-liste";
    }
    
    /**
     * Liste für den Anbieter seine erstellten Jobs auf
     * @param model
     * @param request
     * @return 
     */
    @RequestMapping(value = "/anbieter/jobs/eigene", method = RequestMethod.GET)
    public String jobListAnbieter(final Model model, final HttpServletRequest request) {
        logger.debug("All Jobs---->");
        
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username = auth.getName();

        //anbieter suchen und dem Job zuweisen
        Anbieter anbieter = anbieterService.getByEmail(username);
        
        final List<Job> jobList = jobService.findByAnbieterId(anbieter.getId());
        
        model.addAttribute("jobList", jobList);
        
        logger.debug("All Jobs <------");
        return "job-liste";
    
    }
    @RequestMapping(value = "/schueler/jobs/detail", method = RequestMethod.GET)
    public ModelAndView getJobDetail(@RequestParam("id") final Integer id, final Model model, final HttpServletRequest request) {
        Job job = jobService.findById(id);
        Anbieter anbieter = anbieterService.getById(job.getAnbieter());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("job", job);
        modelAndView.addObject("anbieter", anbieter.getName());
        modelAndView.setViewName("job-detail");

        return modelAndView;

    }

    /**
     * Simply selects the home view to render by returning its name.
     *
     * @param request needed to get the referring url
     * @return the logical view to be returned
     */
    @RequestMapping(value = "/anbieter/jobs/neu", method = RequestMethod.GET)
    public ModelAndView jobFormular(final HttpServletRequest request) {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("job", new Job());

        modelAndView.setViewName("job-neu");

        return modelAndView;
    }

    /**
     *
     * @param job
     * @param model
     * @param request
     * @return
     */
    @RequestMapping(value = "/anbieter/jobs/neu", method = RequestMethod.POST)
    public ModelAndView saveForm(@Valid Job job, BindingResult result) {

        System.out.println("Jobbezeichnung: " + job.getBezeichnung());
        ModelAndView modelAndView;
        //neuen Job in der Datenbak abspeichern:
        if (result.hasErrors()) {
            modelAndView = new ModelAndView();
            modelAndView.addObject("error", "Es besteht ein Fehler in Ihrer Eingabe");
            modelAndView.addObject(result.getModel());
            modelAndView.addObject("job", job);
            modelAndView.setViewName("job-neu");

        } else {
            //aktuell eingeloggter Benutzer (ist die Email)
            Authentication auth = SecurityContextHolder.getContext().getAuthentication();
            String username = auth.getName();

            //anbieter suchen und dem Job zuweisen
            Anbieter anbieter = anbieterService.getByEmail(username);
            job.setAnbieter(anbieter.getId());
            job.setErstelldatum(new Date());

            jobService.addJob(job);

            modelAndView = new ModelAndView();
            modelAndView.addObject("success", "Job wurde gespeichert!");
            modelAndView.addObject("job", job);
            modelAndView.setViewName("job-neu");
        }

        return modelAndView;
    }
    
    @RequestMapping(value = "/schueler/jobs/zuordnen", method = RequestMethod.GET)
    public ModelAndView jobZuordnen(@RequestParam("id") Integer id) {
            Authentication auth = SecurityContextHolder.getContext().getAuthentication();
            String username = auth.getName();
            Schueler schueler = schuelerService.getByEmail(username);
            System.out.println("Job-Id: " + id);
            System.out.println("Schueler-Id: ??" + schueler.getId());

            Job job = jobService.findById(id);
            jobService.addSchuelerToJob(job, schueler.getId());
            Anbieter anbieter = anbieterService.getById(job.getAnbieter());

            //seite wieder anzeigen:
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.addObject("job", job);
            modelAndView.addObject("anbieter", anbieter.getName());
            modelAndView.setViewName("job-detail");
       
        return modelAndView;

    }

}
