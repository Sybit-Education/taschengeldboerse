package com.sybit.education.taschengeldboerse.repository;


import com.sybit.education.taschengeldboerse.domain.Schueler;
import com.sybit.education.taschengeldboerse.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by stl on 09.06.2015.
 */
public interface SchuelerRepository extends JpaRepository<Schueler,Long> {

    List<Schueler> findByEmail(String email);

}
