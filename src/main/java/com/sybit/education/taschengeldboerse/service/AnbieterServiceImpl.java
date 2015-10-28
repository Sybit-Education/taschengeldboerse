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
        List<Anbieter> anbieterList = repository.findByEmail(email);
        
        if(anbieterList.size() > 0) {
            return anbieterList.get(0);
        } else {
            return null;
        }
        
    }

    @Override
    public Anbieter getById(Integer id) {
        List<Anbieter> anbieterList = repository.findById(id);
        
        if(anbieterList.size() > 0) {
            return anbieterList.get(0);
        } else {
            return null;
        }
    }
    
}
