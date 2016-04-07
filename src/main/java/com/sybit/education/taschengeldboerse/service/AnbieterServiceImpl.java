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
import org.springframework.stereotype.Service;

/**
 *
 * @author Schulungsnb04
 */

@Service

public class AnbieterServiceImpl implements AnbieterService {
    
    @Autowired
    AnbieterRepository repository;

    @Override
    public Anbieter getByEmail(String email) {
        return repository.findByEmail(email);      
    }

    @Override
    public Anbieter getById(Integer id) {
        
        return repository.findById(id);
        
    }
    
    
    @Override
    public List<Anbieter> getAll(){
        
       return repository.findAll();
    
    }

    @Override
    public Anbieter findById(Integer id) {
        return repository.findById(id);
    }
    
}
