/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sybit.education.taschengeldboerse.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author sat
 */
@Entity
@Table(name = "jobs")
public class Job implements Serializable {

    /**
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    @Column(name = "bezeichnung")
    @NotEmpty(message="Bitte Bezeichnung angeben")
    private String bezeichnung;
    
    @Column(name = "anbieter")
    private Integer anbieter;

    @Column(name = "schueler")
    private Integer schueler; 

    @Column(name = "Datum")
    @NotEmpty(message="Bitte Datum angeben")
    private String datum; 
    
    @Column(name = "uhrzeit")
    @NotEmpty(message="Bitte Uhrzeit angeben")
    private String uhrzeit;

    @Column(name = "zeitaufwand")
    @NotEmpty(message="Bitte Zeitaufwand angeben")
    private String zeitaufwand;

    @Column(name = "entlohnung")
    @NotEmpty(message="Bitte Entlohnung angeben")
    private String entlohnung;

    @Column(name = "zusaetzliche_infos")
    @NotEmpty(message="Bitte Zusaetzliche Infos angeben")
    private String zusaetzlicheInfos;

    @Column(name = "ort")
    @NotEmpty(message="Bitte Ort angeben")
    private String ort;
    
    @Column(name = "erstelldatum")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date erstelldatum;
    
    
    
    public Job() {
    }
    
    public Job(String bezeichnung, Integer Anbieter, Integer Schueler) {
        this.bezeichnung = bezeichnung;
        this.anbieter = Anbieter;
        this.schueler = Schueler;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    
    public Integer getSchueler() {
        return schueler;
    }

    public void setSchueler(Integer schueler) {
        this.schueler = schueler;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String Datum) {
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
    
    public String getOrt() {
        return ort;
    }
    
    public void setOrt(String ort) {
        this.ort = ort;
    }

    public Date getErstelldatum() {
        return erstelldatum;
    }
    public void setErstelldatum(Date erstelldatum) {
        this.erstelldatum = erstelldatum;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.id);
        hash = 43 * hash + Objects.hashCode(this.bezeichnung);
        hash = 43 * hash + Objects.hashCode(this.anbieter);
        hash = 43 * hash + Objects.hashCode(this.schueler);
        hash = 43 * hash + Objects.hashCode(this.datum);
        hash = 43 * hash + Objects.hashCode(this.uhrzeit);
        hash = 43 * hash + Objects.hashCode(this.zeitaufwand);
        hash = 43 * hash + Objects.hashCode(this.entlohnung);
        hash = 43 * hash + Objects.hashCode(this.zusaetzlicheInfos);
        hash = 43 * hash + Objects.hashCode(this.ort);
        hash = 43 * hash + Objects.hashCode(this.erstelldatum);
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
        if (!Objects.equals(this.datum, other.datum)) {
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
        if (!Objects.equals(this.ort, other.ort)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.anbieter, other.anbieter)) {
            return false;
        }
        if (!Objects.equals(this.schueler, other.schueler)) {
            return false;
        }
        if (!Objects.equals(this.erstelldatum, other.erstelldatum)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Job{" + "id=" + id + ", bezeichnung=" + bezeichnung + ", anbieter=" + anbieter + ", schueler=" + schueler + ", datum=" + datum + ", uhrzeit=" + uhrzeit + ", zeitaufwand=" + zeitaufwand + ", entlohnung=" + entlohnung + ", zusaetzlicheInfos=" + zusaetzlicheInfos + ", ort=" + ort + ", erstelldatum=" + erstelldatum + '}';
    }
    
}
