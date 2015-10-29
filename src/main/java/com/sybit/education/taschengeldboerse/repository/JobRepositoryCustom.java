/*
 * Schuelerprojekt: Taschengeldboerse
 * Sybit GmbH - www.sybit.de -  Apache License, Version 2.0
 * https://github.com/Sybit-Education/taschengeldboerse
 */
package com.sybit.education.taschengeldboerse.repository;

import com.sybit.education.taschengeldboerse.domain.Job;
import java.util.List;

/**
 *
 * @author tsa
 */
public interface JobRepositoryCustom {
    
    List<Job> notassignedList();
    List<Job> findByAnbieter(Integer anbieterId);
}
