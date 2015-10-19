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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



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
   public String add( final HttpServletRequest request) {
     
      return "job-neu";
   }
   
   

}