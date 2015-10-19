/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sybit.education.taschengeldboerse.service;

import com.sybit.education.taschengeldboerse.domain.Job;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.sybit.education.taschengeldboerse.repository.JobsRepository;

/**
 *
 * @author sat
 */
@Service
public class JobsServiceImpl implements JobsService {

    @Autowired
    JobsRepository repository;
    
    @Override
    public List<Job> findAll() {
        return repository.findAll();
    }
    
}