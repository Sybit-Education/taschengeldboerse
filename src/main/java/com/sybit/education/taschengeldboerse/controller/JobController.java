package com.sybit.education.taschengeldboerse.controller;


import com.sybit.education.taschengeldboerse.domain.Job;
import com.sybit.education.taschengeldboerse.service.JobsService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

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
public class JobController {

    private static final Logger logger = LoggerFactory.getLogger(JobController.class);
    
    @Autowired
    private JobsService jobService;
    
    
   /**
    * Simply selects the home view to render by returning its name.
    *
    * @param request needed to get the referring url
    * @return the logical view to be returned
    */

    /**
     * @param model
     * @param request
     * @return
     */
    @RequestMapping(value = "/jobs", method = RequestMethod.GET)
    public String jobList(final Model model, final HttpServletRequest request) {
        logger.debug("All Jobs---->");
        
        final List<Job> jobList = jobService.findAll();
        
        model.addAttribute("jobList", jobList);
       logger.debug("All Jobs <------");
    return "job-liste";
   }
   
   
   /**
    * Simply selects the home view to render by returning its name.
    *
    * @param request needed to get the referring url
    * @return the logical view to be returned
    */
   @RequestMapping(value = "/jobs/neu", method = RequestMethod.GET)
   public ModelAndView jobFormular( final HttpServletRequest request) {
    
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
    @RequestMapping(value = "/jobs/neu", method = RequestMethod.POST)
    public ModelAndView saveForm(@ModelAttribute("job") Job job, final Model model, final HttpServletRequest request) {

        System.out.println("Jobbezeichnung: " + job.getBezeichnung());
        
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("job", job);

        modelAndView.setViewName("job-neu");

        return modelAndView;
    }

}