/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sybit.education.taschengeldboerse.testService;

import com.sybit.education.taschengeldboerse.domain.Job;
import com.sybit.education.taschengeldboerse.domain.Schueler;
import com.sybit.education.taschengeldboerse.testutil.AbstractDatabaseTest;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.Test;
import com.sybit.education.taschengeldboerse.service.JobsService;
import java.util.Date;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author sat
 */
public class JobServiceTest extends AbstractDatabaseTest {

    @Autowired
    JobsService service;

    @Test
    public void testFindAll() {
        List<Job> jobList;
        jobList = service.findAll();
        //assertEquals(1, jobList.size());

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
        job.setEntlohnung("20 €");
        job.setErstelldatum(new Date());
        job.setZusaetzlicheInfos("Test");
        job.setUhrzeit("15:00");
        job.setZeitaufwand("3h");

        service.addJob(job);

        assertEquals(Integer.valueOf(1), job.getId());
        assertEquals("Singen", job.getOrt());
    }

    @Test
    public void testOrderByDateAndNotAsigned() {
        List<Job> jobList = service.findAllByOrderByErstelldatumDescWhereSchuelerIsNull();
        assertEquals(3, jobList.size());
        assertEquals(Integer.valueOf(3), jobList.get(0).getId());
    }

    @Test
    public void testAddSchuelerToJob() {
        List<Job> jobList = service.findAll();
        Job job = jobList.get(0);
        service.addSchuelerToJob(job, 1);
        assertEquals((Integer) 1, job.getSchueler());
    }

    @Test
    public void testJobBelegt() {
        List<Job> jobList = service.findAll();
        Job job = jobList.get(0);
        job.setSchueler(2);
        service.addSchuelerToJob(job, 1);
        assertEquals((Integer) 2, job.getSchueler());
    }

    @Test
    public void testUebernehmenJob() {
        Job job = service.findById(1);

        Schueler schueler = service.getSchuelerById(job.getSchueler());

        assertEquals("Paul", schueler.getVorname());
    }

    @Test
    public void findByAnbieterId() {
        List<Job> jobList = service.findByAnbieterId((Integer) 1);

        assertEquals(4, jobList.size());
    }

    public void testSchuelerJob() {
        List<Job> jobList = service.findJobsBySchuelerID((Integer) 1);

        assertEquals(3, jobList.size());

        assertEquals((Integer) 1, jobList.get(0).getSchueler());
    }

    @Override
    public String getDataset() {
        return "database/testJobService.xml";
    }
}
