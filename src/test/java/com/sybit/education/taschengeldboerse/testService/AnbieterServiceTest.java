/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sybit.education.taschengeldboerse.testService;

import com.sybit.education.taschengeldboerse.domain.Anbieter;
import com.sybit.education.taschengeldboerse.domain.Job;
import com.sybit.education.taschengeldboerse.service.AnbieterService;
import com.sybit.education.taschengeldboerse.service.JobsService;
import com.sybit.education.taschengeldboerse.testutil.AbstractDatabaseTest;
import static org.junit.Assert.assertEquals;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.Test;


/**
 *
 * @author sat
 */
public class AnbieterServiceTest extends AbstractDatabaseTest{
    
    @Autowired
    AnbieterService service;
    
    @Autowired
    JobsService jobService;
    
    @Test
    public void testgetById(){
        Job job = jobService.findById(1);
        
        Anbieter anbieter = service.getById(job.getAnbieter());
        
        assertEquals("Max", anbieter.getVorname());
    }

    
    @Override
    public String getDataset() {
        return "database/testAnbieterService.xml";
    }
}