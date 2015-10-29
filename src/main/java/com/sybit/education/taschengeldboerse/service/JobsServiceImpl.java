/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sybit.education.taschengeldboerse.service;

import com.sybit.education.taschengeldboerse.domain.Job;
import com.sybit.education.taschengeldboerse.domain.Schueler;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sybit.education.taschengeldboerse.repository.SchuelerRepository;
import com.sybit.education.taschengeldboerse.repository.JobRepository;

/**
 *
 * @author sat
 */
@Service

public class JobsServiceImpl implements JobsService {

    @Autowired
    JobRepository jobRepository;
    
    @Autowired
    SchuelerRepository schuelerRepository;
    
    @Override
    public List<Job> findAll() {
        return jobRepository.findAll();
    }

    @Override
    public void addJob(Job job) {
        
        if(job.getAnbieter() == null) {
            job.setAnbieter(1); //zum Standardbenutzer hinzufügen. Muss noch geändert werden.
        }
        jobRepository.save(job);
    }
    
    @Override
    public void addSchuelerToJob(Job job, Integer id) {
        if(job.getSchueler() == null) {
            job.setSchueler(id);
        }
        
        jobRepository.save(job);
    }
    
    @Override
    public Job findById(Integer id) {
        return jobRepository.findOne(id);
    }  
    
    @Override
    public List<Job> findAllByOrderByErstelldatumDescWhereSchuelerIsNull(){
        return jobRepository.notassignedList();
    }
    
    @Override
    public Schueler getSchuelerById(Integer id ) {
        return schuelerRepository.findById(id).get(0);
    }

    @Override
    public List<Job> findBySchueler(Integer schueler) {
        return jobRepository.findById(id).get(1); //To change body of generated methods, choose Tools | Templates.
    }
}
