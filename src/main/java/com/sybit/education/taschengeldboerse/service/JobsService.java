/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sybit.education.taschengeldboerse.service;

import com.sybit.education.taschengeldboerse.domain.Job;
import java.util.List;

/**
 *
 * @author sat
 */
public interface JobsService {
    
    List<Job> findAll();
    
    void addJob(Job job);
    
    Job findById(Integer id);
    
    List<Job> findAllByOrderByErstelldatumDescWhereSchuelerIsNull();
}
