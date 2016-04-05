package com.sybit.education.taschengeldboerse.repository;


import com.sybit.education.taschengeldboerse.domain.Anbieter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by stl on 09.06.2015.
 */
public interface AnbieterRepository extends JpaRepository<Anbieter,Long> {
    
    Anbieter findById(Integer id);

    List<Anbieter> findByEmail(String email);

}
