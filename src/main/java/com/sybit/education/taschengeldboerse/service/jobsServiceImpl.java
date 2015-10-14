/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sybit.education.taschengeldboerse.service;

import com.sybit.education.taschengeldboerse.domain.jobs;
import com.sybit.education.taschengeldboerse.repositorys.jobsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author sat
 */
public class jobsServiceImpl implements jobsService {

    @Autowired
    jobsRepository repository;
    
    @Override
    public List<jobs> findAll() {
        return repository.findAll();
    }
    
}
