/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sybit.education.taschengeldboerse.service;

import com.sybit.education.taschengeldboerse.domain.jobs;
import java.util.List;

/**
 *
 * @author sat
 */
public interface jobsService {
    
    List<jobs> findAll();
}
