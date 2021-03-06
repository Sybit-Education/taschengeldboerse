/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sybit.education.taschengeldboerse.service;

import com.sybit.education.taschengeldboerse.domain.Anbieter;
import java.util.List;

/**
 *
 * @author Schulungsnb04
 */
public interface AnbieterService {
    
    Anbieter getByEmail(String email);
    
    Anbieter getById(Integer id);
    
    List<Anbieter> getAll();
    
    Anbieter findById(Integer id);
    
}