/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sybit.education.taschengeldboerse.domain;

import java.util.Calendar;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author sat
 */
public class jobs {
    
    /**
     * 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer ID;
    
    @Column(name = "Bezeichnung")
    private String Bezeichnung;
    
    @Column(name = "Anbieter")
    private Integer Anbieter;
    
    @Column(name = "Datum")
    private Calendar Datum;
    
    @Column(name = "Uhrzeit")
    private String Uhrzeit;
    
    @Column(name = "Zeitaufwand")
    private String Zeitaufwand;
    
    @Column(name = "Entlohnung")
    private String Entlohnung;
    
    @Column(name = "Zusaetzliche_Infos")
    private String ZusaetzlicheInfos;

    
    public jobs() {
    };
    
    public jobs(String Bezeichnung, Integer Anbieter) {
        this.Bezeichnung = Bezeichnung;
        this.Anbieter = Anbieter;
    }
    
    
    
    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getBezeichnung() {
        return Bezeichnung;
    }

    public void setBezeichnung(String Bezeichnung) {
        this.Bezeichnung = Bezeichnung;
    }

    public Integer getAnbieter() {
        return Anbieter;
    }

    public void setAnbieter(Integer Anbieter) {
        this.Anbieter = Anbieter;
    }

    public Calendar getDatum() {
        return Datum;
    }

    public void setDatum(Calendar Datum) {
        this.Datum = Datum;
    }

    public String getUhrzeit() {
        return Uhrzeit;
    }

    public void setUhrzeit(String Uhrzeit) {
        this.Uhrzeit = Uhrzeit;
    }

    public String getZeitaufwand() {
        return Zeitaufwand;
    }

    public void setZeitaufwand(String Zeitaufwand) {
        this.Zeitaufwand = Zeitaufwand;
    }

    public String getEntlohnung() {
        return Entlohnung;
    }

    public void setEntlohnung(String Entlohnung) {
        this.Entlohnung = Entlohnung;
    }

    public String getZusaetzlicheInfos() {
        return ZusaetzlicheInfos;
    }

    public void setZusaetzlicheInfos(String ZusaetzlicheInfos) {
        this.ZusaetzlicheInfos = ZusaetzlicheInfos;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.ID);
        hash = 17 * hash + Objects.hashCode(this.Bezeichnung);
        hash = 17 * hash + Objects.hashCode(this.Anbieter);
        hash = 17 * hash + Objects.hashCode(this.Datum);
        hash = 17 * hash + Objects.hashCode(this.Uhrzeit);
        hash = 17 * hash + Objects.hashCode(this.Zeitaufwand);
        hash = 17 * hash + Objects.hashCode(this.Entlohnung);
        hash = 17 * hash + Objects.hashCode(this.ZusaetzlicheInfos);
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
        final jobs other = (jobs) obj;
        if (!Objects.equals(this.Bezeichnung, other.Bezeichnung)) {
            return false;
        }
        if (!Objects.equals(this.Uhrzeit, other.Uhrzeit)) {
            return false;
        }
        if (!Objects.equals(this.Zeitaufwand, other.Zeitaufwand)) {
            return false;
        }
        if (!Objects.equals(this.Entlohnung, other.Entlohnung)) {
            return false;
        }
        if (!Objects.equals(this.ZusaetzlicheInfos, other.ZusaetzlicheInfos)) {
            return false;
        }
        if (!Objects.equals(this.ID, other.ID)) {
            return false;
        }
        if (!Objects.equals(this.Anbieter, other.Anbieter)) {
            return false;
        }
        if (!Objects.equals(this.Datum, other.Datum)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jobs{" + "ID=" + ID + ", Bezeichnung=" + Bezeichnung + ", Anbieter=" + Anbieter + ", Datum=" + Datum + ", Uhrzeit=" + Uhrzeit + ", Zeitaufwand=" + Zeitaufwand + ", Entlohnung=" + Entlohnung + ", ZusaetzlicheInfos=" + ZusaetzlicheInfos + '}';
    }
    
    
}
