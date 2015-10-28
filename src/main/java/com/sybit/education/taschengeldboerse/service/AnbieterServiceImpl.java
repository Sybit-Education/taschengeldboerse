/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sybit.education.taschengeldboerse.service;

import com.sybit.education.taschengeldboerse.domain.Anbieter;
import com.sybit.education.taschengeldboerse.repository.AnbieterRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author sat
 */
public class AnbieterServiceImpl {
    
    @Autowired 
    AnbieterRepository anbieterRepository;
    
    
    public List<Anbieter> findById() {
        return anbieterRepository.findById();
    }
    
}
