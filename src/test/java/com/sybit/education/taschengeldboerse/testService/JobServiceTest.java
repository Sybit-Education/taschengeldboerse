/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sybit.education.taschengeldboerse.testService;

import com.sybit.education.taschengeldboerse.domain.Job;
import com.sybit.education.taschengeldboerse.testutil.AbstractDatabaseTest;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.Test;
import com.sybit.education.taschengeldboerse.service.JobsService;
import static org.junit.Assert.assertEquals;


/**
 *
 * @author sat
 */
public class JobServiceTest extends AbstractDatabaseTest{
    
    @Autowired
    JobsService service;
    
    @Test
    public void testFindAll(){
        List<Job> jobList;
        jobList=service.findAll();
        assertEquals(1, jobList.size());
        
        Job job = jobList.get(0);
        assertEquals("Test Job", job.getBezeichnung());
    }
    
    @Test
    public void testSaveJob() {
        Job job = new Job();
        job.setId(1);
        job.setOrt("Singen");
        job.setAnbieter(1);
        job.setDatum("01.01.2015");
        job.setBezeichnung("test");
        
        service.addJob(job);
        
        assertEquals(Integer.valueOf(1), job.getId());
        assertEquals("Singen", job.getOrt());
    }
    
    @Override
    public String getDataset() {
        return "database/testJobService.xml";
    }
}
