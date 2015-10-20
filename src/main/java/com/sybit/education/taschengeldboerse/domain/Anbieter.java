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
public class Anbieter extends User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    
    @Column(name = "Anrede")
    private String anrede;
    
    @Column(name = "Vorname")
    private String vorname;
    
    @Column(name = "Name")
    private String name;
    
    @Column(name = "Geburtsdatum")
    private Calendar geburtsdatum;
    
    @Column(name = "Straße")
    private String straße;
    
    @Column(name = "Hausnummer")
    private String hausnummer;
    
    @Column(name = "PLZ")
    private String plz;
    
    @Column(name = "Wohnort")
    private String wohnort;
    
    @Column(name = "Telefonnummer")
    private String telefonnummer;
    
    @Column(name = "Emailadresse")
    private String emailadresse;
    
    @Column(name = "Merkblatt")
    private boolean merkblatt;
    
    @Column(name = "Datenschutz")
    private boolean datenschutz;

    public Anbieter() {
    }

    public Anbieter(String Anrede, String Vorname, String Name, Calendar Geburtsdatum, String Straße, String Hausnummer, String PLZ, String Wohnort, String Emailadresse, boolean Merkblatt, boolean Datenschutz) {
        this.anrede = Anrede;
        this.vorname = Vorname;
        this.name = Name;
        this.geburtsdatum = Geburtsdatum;
        this.straße = Straße;
        this.hausnummer = Hausnummer;
        this.plz = PLZ;
        this.wohnort = Wohnort;
        this.emailadresse = Emailadresse;
        this.merkblatt = Merkblatt;
        this.datenschutz = Datenschutz;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer ID) {
        this.id = ID;
    }

    public String getAnrede() {
        return anrede;
    }

    public void setAnrede(String Anrede) {
        this.anrede = Anrede;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String Vorname) {
        this.vorname = Vorname;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public Calendar getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(Calendar Geburtsdatum) {
        this.geburtsdatum = Geburtsdatum;
    }

    public String getStraße() {
        return straße;
    }

    public void setStraße(String Straße) {
        this.straße = Straße;
    }

    public String getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(String Hausnummer) {
        this.hausnummer = Hausnummer;
    }

    public String getPLZ() {
        return plz;
    }

    public void setPLZ(String PLZ) {
        this.plz = PLZ;
    }

    public String getWohnort() {
        return wohnort;
    }

    public void setWohnort(String Wohnort) {
        this.wohnort = Wohnort;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String Telefonnummer) {
        this.telefonnummer = Telefonnummer;
    }

    public String getEmailadresse() {
        return emailadresse;
    }

    public void setEmailadresse(String Emailadresse) {
        this.emailadresse = Emailadresse;
    }

    public boolean isMerkblatt() {
        return merkblatt;
    }

    public void setMerkblatt(boolean Merkblatt) {
        this.merkblatt = Merkblatt;
    }

    public boolean isDatenschutz() {
        return datenschutz;
    }

    public void setDatenschutz(boolean Datenschutz) {
        this.datenschutz = Datenschutz;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.id);
        hash = 43 * hash + Objects.hashCode(this.anrede);
        hash = 43 * hash + Objects.hashCode(this.vorname);
        hash = 43 * hash + Objects.hashCode(this.name);
        hash = 43 * hash + Objects.hashCode(this.geburtsdatum);
        hash = 43 * hash + Objects.hashCode(this.straße);
        hash = 43 * hash + Objects.hashCode(this.hausnummer);
        hash = 43 * hash + Objects.hashCode(this.plz);
        hash = 43 * hash + Objects.hashCode(this.wohnort);
        hash = 43 * hash + Objects.hashCode(this.telefonnummer);
        hash = 43 * hash + Objects.hashCode(this.emailadresse);
        hash = 43 * hash + (this.merkblatt ? 1 : 0);
        hash = 43 * hash + (this.datenschutz ? 1 : 0);
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
        final Anbieter other = (Anbieter) obj;
        if (this.merkblatt != other.merkblatt) {
            return false;
        }
        if (this.datenschutz != other.datenschutz) {
            return false;
        }
        if (!Objects.equals(this.anrede, other.anrede)) {
            return false;
        }
        if (!Objects.equals(this.vorname, other.vorname)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.straße, other.straße)) {
            return false;
        }
        if (!Objects.equals(this.hausnummer, other.hausnummer)) {
            return false;
        }
        if (!Objects.equals(this.plz, other.plz)) {
            return false;
        }
        if (!Objects.equals(this.wohnort, other.wohnort)) {
            return false;
        }
        if (!Objects.equals(this.telefonnummer, other.telefonnummer)) {
            return false;
        }
        if (!Objects.equals(this.emailadresse, other.emailadresse)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.geburtsdatum, other.geburtsdatum)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "anbieter{" + "ID=" + id + ", Anrede=" + anrede + ", Vorname=" + vorname + ", Name=" + name + ", Geburtsdatum=" + geburtsdatum + ", Stra\u00dfe=" + straße + ", Hausnummer=" + hausnummer + ", PLZ=" + plz + ", Wohnort=" + wohnort + ", Telefonnummer=" + telefonnummer + ", Emailadresse=" + emailadresse + ", Merkblatt=" + merkblatt + ", Datenschutz=" + datenschutz + '}';
    }
    
    
    
}
