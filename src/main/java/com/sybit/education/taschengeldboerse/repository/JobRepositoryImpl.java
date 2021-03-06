/*
 * Schuelerprojekt: Taschengeldboerse
 * Sybit GmbH - www.sybit.de -  Apache License, Version 2.0
 * https://github.com/Sybit-Education/taschengeldboerse
 */
package com.sybit.education.taschengeldboerse.repository;

import com.sybit.education.taschengeldboerse.domain.Job;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author tsa
 */
@Repository
@Transactional
public class JobRepositoryImpl implements JobRepositoryCustom {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Job> notassignedList() {

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();

        CriteriaQuery<Job> cq = cb.createQuery(Job.class);

        Root<Job> job = cq.from(Job.class);

        Expression<Integer> schueler = job.get("schueler");

        cq.select(job).where(cb.isNull(schueler)).orderBy(cb.desc(job.get("erstelldatum")));

        Query query = entityManager.createQuery(cq);

        List<Job> jobListe = query.getResultList();

        return jobListe;
    }

    @Override
    public List<Job> findByAnbieter(Integer anbieterId) {
        System.out.println("anbieterId= " + anbieterId);

        List<Job> jobListe = new ArrayList<>();

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Job> cq = cb.createQuery(Job.class);

        Root<Job> job = cq.from(Job.class);

        Expression<Integer> anbieter = job.get("anbieter");

        cq.select(job).where(cb.equal(anbieter, anbieterId));

        Query query = entityManager.createQuery(cq);

        jobListe = query.getResultList();

        return jobListe;
    }

    @Override
    public List<Job> schuelerJobs(Integer schuelerID) {

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();

        CriteriaQuery<Job> cq = cb.createQuery(Job.class);

        Root<Job> job = cq.from(Job.class);

        Expression<Integer> schueler = job.get("schueler");

        cq.select(job).where(cb.equal(schueler, schuelerID));

        Query query = entityManager.createQuery(cq);

        List<Job> schuelerJobsListe = query.getResultList();
        return schuelerJobsListe;

    }
}
