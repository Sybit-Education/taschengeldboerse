/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sybit.education.taschengeldboerse.domain;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 * @author sat
 */
@Entity
@Table(name = "jobs")
public class Job implements Serializable{
    
    /**
     * 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer ID;
    
    @Column(name = "Bezeichnung")
    private String bezeichnung;
    
    @Column(name = "Anbieter")
    private Integer anbieter;
    
    @Column(name = "Datum")
    private Calendar datum;
    
    @Column(name = "Uhrzeit")
    private String uhrzeit;
    
    @Column(name = "Zeitaufwand")
    private String zeitaufwand;
    
    @Column(name = "Entlohnung")
    private String entlohnung;
    
    @Column(name = "Zusaetzliche_Infos")
    private String zusaetzlicheInfos;

    
    public Job() {
    };
    
    public Job(String bezeichnung, Integer Anbieter) {
        this.bezeichnung = bezeichnung;
        this.anbieter = Anbieter;
    }
    
    
    
    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String Bezeichnung) {
        this.bezeichnung = Bezeichnung;
    }

    public Integer getAnbieter() {
        return anbieter;
    }

    public void setAnbieter(Integer Anbieter) {
        this.anbieter = Anbieter;
    }

    public Calendar getDatum() {
        return datum;
    }

    public void setDatum(Calendar Datum) {
        this.datum = Datum;
    }

    public String getUhrzeit() {
        return uhrzeit;
    }

    public void setUhrzeit(String Uhrzeit) {
        this.uhrzeit = Uhrzeit;
    }

    public String getZeitaufwand() {
        return zeitaufwand;
    }

    public void setZeitaufwand(String Zeitaufwand) {
        this.zeitaufwand = Zeitaufwand;
    }

    public String getEntlohnung() {
        return entlohnung;
    }

    public void setEntlohnung(String Entlohnung) {
        this.entlohnung = Entlohnung;
    }

    public String getZusaetzlicheInfos() {
        return zusaetzlicheInfos;
    }

    public void setZusaetzlicheInfos(String ZusaetzlicheInfos) {
        this.zusaetzlicheInfos = ZusaetzlicheInfos;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.ID);
        hash = 17 * hash + Objects.hashCode(this.bezeichnung);
        hash = 17 * hash + Objects.hashCode(this.anbieter);
        hash = 17 * hash + Objects.hashCode(this.datum);
        hash = 17 * hash + Objects.hashCode(this.uhrzeit);
        hash = 17 * hash + Objects.hashCode(this.zeitaufwand);
        hash = 17 * hash + Objects.hashCode(this.entlohnung);
        hash = 17 * hash + Objects.hashCode(this.zusaetzlicheInfos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Job other = (Job) obj;
        if (!Objects.equals(this.bezeichnung, other.bezeichnung)) {
            return false;
        }
        if (!Objects.equals(this.uhrzeit, other.uhrzeit)) {
            return false;
        }
        if (!Objects.equals(this.zeitaufwand, other.zeitaufwand)) {
            return false;
        }
        if (!Objects.equals(this.entlohnung, other.entlohnung)) {
            return false;
        }
        if (!Objects.equals(this.zusaetzlicheInfos, other.zusaetzlicheInfos)) {
            return false;
        }
        if (!Objects.equals(this.ID, other.ID)) {
            return false;
        }
        if (!Objects.equals(this.anbieter, other.anbieter)) {
            return false;
        }
        if (!Objects.equals(this.datum, other.datum)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jobs{" + "ID=" + ID + ", Bezeichnung=" + bezeichnung + ", Anbieter=" + anbieter + ", Datum=" + datum + ", Uhrzeit=" + uhrzeit + ", Zeitaufwand=" + zeitaufwand + ", Entlohnung=" + entlohnung + ", ZusaetzlicheInfos=" + zusaetzlicheInfos + '}';
    }
    
    
}
