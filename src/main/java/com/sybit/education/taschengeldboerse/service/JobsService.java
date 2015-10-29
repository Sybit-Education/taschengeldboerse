/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sybit.education.taschengeldboerse.service;

import com.sybit.education.taschengeldboerse.domain.Job;
import com.sybit.education.taschengeldboerse.domain.Schueler;
import java.util.List;

/**
 *
 * @author sat
 */
public interface JobsService {
    
    List<Job> findAll();
    
    void addJob(Job job);
    
    void addSchuelerToJob(Job job, Integer id);
    
    List<Job> findJobsBySchuelerID(Integer id);
    
    Job findById(Integer id);

    public Schueler getSchuelerById(Integer schueler);

    List<Job> findAllByOrderByErstelldatumDescWhereSchuelerIsNull();
    
    List<Job> findBySchueler(Integer schueler);
    
}
