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
public class anbieter {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer ID;
    
    @Column(name = "Anrede")
    private String Anrede;
    
    @Column(name = "Vorname")
    private String Vorname;
    
    @Column(name = "Name")
    private String Name;
    
    @Column(name = "Geburtsdatum")
    private Calendar Geburtsdatum;
    
    @Column(name = "Straße")
    private String Straße;
    
    @Column(name = "Hausnummer")
    private String Hausnummer;
    
    @Column(name = "PLZ")
    private String PLZ;
    
    @Column(name = "Wohnort")
    private String Wohnort;
    
    @Column(name = "Telefonnummer")
    private String Telefonnummer;
    
    @Column(name = "Emailadresse")
    private String Emailadresse;
    
    @Column(name = "Merkblatt")
    private boolean Merkblatt;
    
    @Column(name = "Datenschutz")
    private boolean Datenschutz;

    public anbieter() {
    }

    public anbieter(String Anrede, String Vorname, String Name, Calendar Geburtsdatum, String Straße, String Hausnummer, String PLZ, String Wohnort, String Emailadresse, boolean Merkblatt, boolean Datenschutz) {
        this.Anrede = Anrede;
        this.Vorname = Vorname;
        this.Name = Name;
        this.Geburtsdatum = Geburtsdatum;
        this.Straße = Straße;
        this.Hausnummer = Hausnummer;
        this.PLZ = PLZ;
        this.Wohnort = Wohnort;
        this.Emailadresse = Emailadresse;
        this.Merkblatt = Merkblatt;
        this.Datenschutz = Datenschutz;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getAnrede() {
        return Anrede;
    }

    public void setAnrede(String Anrede) {
        this.Anrede = Anrede;
    }

    public String getVorname() {
        return Vorname;
    }

    public void setVorname(String Vorname) {
        this.Vorname = Vorname;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Calendar getGeburtsdatum() {
        return Geburtsdatum;
    }

    public void setGeburtsdatum(Calendar Geburtsdatum) {
        this.Geburtsdatum = Geburtsdatum;
    }

    public String getStraße() {
        return Straße;
    }

    public void setStraße(String Straße) {
        this.Straße = Straße;
    }

    public String getHausnummer() {
        return Hausnummer;
    }

    public void setHausnummer(String Hausnummer) {
        this.Hausnummer = Hausnummer;
    }

    public String getPLZ() {
        return PLZ;
    }

    public void setPLZ(String PLZ) {
        this.PLZ = PLZ;
    }

    public String getWohnort() {
        return Wohnort;
    }

    public void setWohnort(String Wohnort) {
        this.Wohnort = Wohnort;
    }

    public String getTelefonnummer() {
        return Telefonnummer;
    }

    public void setTelefonnummer(String Telefonnummer) {
        this.Telefonnummer = Telefonnummer;
    }

    public String getEmailadresse() {
        return Emailadresse;
    }

    public void setEmailadresse(String Emailadresse) {
        this.Emailadresse = Emailadresse;
    }

    public boolean isMerkblatt() {
        return Merkblatt;
    }

    public void setMerkblatt(boolean Merkblatt) {
        this.Merkblatt = Merkblatt;
    }

    public boolean isDatenschutz() {
        return Datenschutz;
    }

    public void setDatenschutz(boolean Datenschutz) {
        this.Datenschutz = Datenschutz;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.ID);
        hash = 43 * hash + Objects.hashCode(this.Anrede);
        hash = 43 * hash + Objects.hashCode(this.Vorname);
        hash = 43 * hash + Objects.hashCode(this.Name);
        hash = 43 * hash + Objects.hashCode(this.Geburtsdatum);
        hash = 43 * hash + Objects.hashCode(this.Straße);
        hash = 43 * hash + Objects.hashCode(this.Hausnummer);
        hash = 43 * hash + Objects.hashCode(this.PLZ);
        hash = 43 * hash + Objects.hashCode(this.Wohnort);
        hash = 43 * hash + Objects.hashCode(this.Telefonnummer);
        hash = 43 * hash + Objects.hashCode(this.Emailadresse);
        hash = 43 * hash + (this.Merkblatt ? 1 : 0);
        hash = 43 * hash + (this.Datenschutz ? 1 : 0);
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
        final anbieter other = (anbieter) obj;
        if (this.Merkblatt != other.Merkblatt) {
            return false;
        }
        if (this.Datenschutz != other.Datenschutz) {
            return false;
        }
        if (!Objects.equals(this.Anrede, other.Anrede)) {
            return false;
        }
        if (!Objects.equals(this.Vorname, other.Vorname)) {
            return false;
        }
        if (!Objects.equals(this.Name, other.Name)) {
            return false;
        }
        if (!Objects.equals(this.Straße, other.Straße)) {
            return false;
        }
        if (!Objects.equals(this.Hausnummer, other.Hausnummer)) {
            return false;
        }
        if (!Objects.equals(this.PLZ, other.PLZ)) {
            return false;
        }
        if (!Objects.equals(this.Wohnort, other.Wohnort)) {
            return false;
        }
        if (!Objects.equals(this.Telefonnummer, other.Telefonnummer)) {
            return false;
        }
        if (!Objects.equals(this.Emailadresse, other.Emailadresse)) {
            return false;
        }
        if (!Objects.equals(this.ID, other.ID)) {
            return false;
        }
        if (!Objects.equals(this.Geburtsdatum, other.Geburtsdatum)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "anbieter{" + "ID=" + ID + ", Anrede=" + Anrede + ", Vorname=" + Vorname + ", Name=" + Name + ", Geburtsdatum=" + Geburtsdatum + ", Stra\u00dfe=" + Straße + ", Hausnummer=" + Hausnummer + ", PLZ=" + PLZ + ", Wohnort=" + Wohnort + ", Telefonnummer=" + Telefonnummer + ", Emailadresse=" + Emailadresse + ", Merkblatt=" + Merkblatt + ", Datenschutz=" + Datenschutz + '}';
    }
    
    
    
}
