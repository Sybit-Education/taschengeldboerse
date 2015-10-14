/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sybit.education.taschengeldboerse.repositorys;

import com.sybit.education.taschengeldboerse.domain.jobs;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author sat
 */
public interface jobsRepository extends JpaRepository<jobs, Integer>{
    
    List<jobs> findAll();
}
