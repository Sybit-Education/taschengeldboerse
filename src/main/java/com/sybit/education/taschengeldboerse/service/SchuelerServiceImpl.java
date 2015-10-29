/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sybit.education.taschengeldboerse.service;

import com.sybit.education.taschengeldboerse.domain.Schueler;
import com.sybit.education.taschengeldboerse.repository.SchuelerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchuelerServiceImpl implements SchuelerService {
  
    @Autowired
    SchuelerRepository schuelerRepository;
    
     @Override
    public Schueler getByEmail(String email) {
        List<Schueler> schuelerList = schuelerRepository.findByEmail(email);
        
        if(schuelerList.size() > 0) {
            return schuelerList.get(0);
        } else {
            return null;
        }
        
    }
    
    @Override
    public Schueler findById(Integer id) {       
        return schuelerRepository.findById(id).get(0);
    }
    
    @Override
    public List<Schueler> findByName(String username){
        return schuelerRepository.findByName(username);
    }
    
}
