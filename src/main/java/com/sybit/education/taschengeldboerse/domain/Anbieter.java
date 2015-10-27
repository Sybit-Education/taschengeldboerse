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
import javax.validation.constraints.Size;

/**
 *
 * @author sat
 */
@Entity(name = "anbieter")
public class Anbieter implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    @Size(min = 5, message = "Bitte E-Mail angeben")
    @Column(unique = true)
    private String email;

    @Column(name = "Anrede")
    private String anrede;

    @Column(name = "Vorname")
    private String vorname;

    @Column(name = "Name")
    private String name;

    @Column(name = "Geburtsdatum")
    private String geburtsdatum;

    @Column(name = "Strasse")
    private String strasse;

    @Column(name = "PLZ")
    private String plz;

    @Column(name = "Wohnort")
    private String wohnort;

    @Column(name = "Telefonnummer")
    private String telefonnummer;

    @Column(name = "Merkblatt")
    private boolean merkblatt;

    @Column(name = "Datenschutz")
    private boolean datenschutz;

    public Anbieter() {
    }

    public Anbieter(User user) {
        this.email = user.getEmail();
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

    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(String geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String Straße) {
        this.strasse = Straße;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
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
        hash = 43 * hash + Objects.hashCode(this.strasse);
        hash = 43 * hash + Objects.hashCode(this.plz);
        hash = 43 * hash + Objects.hashCode(this.wohnort);
        hash = 43 * hash + Objects.hashCode(this.telefonnummer);
        hash = 43 * hash + Objects.hashCode(this.email);
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
        if (!Objects.equals(this.strasse, other.strasse)) {
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
        if (!Objects.equals(this.email, other.email)) {
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
        return "anbieter{" + "ID=" + id + ", Anrede=" + anrede + ", Vorname=" + vorname + ", Name=" + name + ", Geburtsdatum=" + geburtsdatum + ", Stra\u00dfe=" + strasse + ", PLZ=" + plz + ", Wohnort=" + wohnort + ", Telefonnummer=" + telefonnummer + ", Email=" + email + ", Merkblatt=" + merkblatt + ", Datenschutz=" + datenschutz + '}';
    }

}
