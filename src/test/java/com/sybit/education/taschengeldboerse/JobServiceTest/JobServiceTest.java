/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sybit.education.taschengeldboerse.JobServiceTest;

import com.sybit.education.taschengeldboerse.domain.jobs;
import com.sybit.education.taschengeldboerse.service.jobsService;
import com.sybit.education.taschengeldboerse.testutil.AbstractDatabaseTest;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.Assert.assertEquals;


/**
 *
 * @author sat
 */
public class JobServiceTest extends AbstractDatabaseTest{
    
    @Autowired
    jobsService Service;
    
    public void testFindAll(){
        List<jobs> jobList;
        jobList=Service.findAll();
        assertEquals(0, jobList.size());
    }

    @Override
    public String getDataset() {
        return "database/testJobService.xml";
    }
}
