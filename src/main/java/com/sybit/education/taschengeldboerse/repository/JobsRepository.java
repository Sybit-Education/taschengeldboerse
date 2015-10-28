/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sybit.education.taschengeldboerse.repository;

import com.sybit.education.taschengeldboerse.domain.Job;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author sat
 */
public interface JobsRepository extends JpaRepository<Job, Integer>{
    
    List<Job> findAll();
    
    Job findById(Integer id);
    
    List<Job> findAllByOrderByErstelldatumDesc(); 
}
