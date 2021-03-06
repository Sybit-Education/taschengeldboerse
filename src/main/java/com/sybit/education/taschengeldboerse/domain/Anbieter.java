/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sybit.education.taschengeldboerse.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

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

    @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\."
        +"[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@"
        +"(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?",
             message="Bitte eine gültige E-Mail angeben.")
    @Size(min = 5, message = "Bitte E-Mail angeben")
    @Column(unique = true)
    private String email;
   
    @Column(name = "Anrede")
    private String anrede;

    @Column(name = "Vorname")
    @NotEmpty(message="Bitte Vornamen angeben")
    private String vorname;

    @Column(name = "Name")
    @NotEmpty(message="Bitte Namen angeben")
    private String name;
    
    @Column(name = "Geburtsdatum")
    @NotEmpty(message="Bitte Geburtsdatum angeben")
    private String geburtsdatum;

    @Column(name = "Strasse")
    private String strasse;

    @Column(name = "PLZ")
    @NotEmpty(message="Bitte PLZ angeben")
    private String plz;

    @Column(name = "Wohnort")
    @NotEmpty(message="Bitte Wohnort angeben")
    private String wohnort;

    @Column(name = "Telefonnummer")
    private String telefonnummer;

    @Column(name = "Merkblatt")
    @AssertTrue(message="Das Merkblatt muss vor der Anmeldung zur Kenntnis genommen werden!")
    private boolean merkblatt;

    @Column(name = "Datenschutz")
    @AssertTrue(message="Die Datenschutzbedingungen müssen akzeptiert werden!")
    private boolean datenschutz;
    
    @Column(name = "AnzahlBewertungen")
    private Integer anzahlBewertungen;

    @Column(name = "BewertungspunkteInsgesammt")
    private Integer bewertungspunkteInsgesammt;
    
  

    public Anbieter() {
    }

    public Anbieter(User user) {
        this.email = user.getEmail();
    }

    public Integer getAnzahlBewertungen() {
        return anzahlBewertungen;
    }

    public void setAnzahlBewertungen(Integer anzahl) {
        this.anzahlBewertungen = anzahl;
    }


    public Integer getBewertungspunkteInsgesammt() {
        return bewertungspunkteInsgesammt;
    }

    public void setBewertungspunkteInsgesammt(Integer bewertungspunkte) {
        this.bewertungspunkteInsgesammt = bewertungspunkte;
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
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.id);
        hash = 31 * hash + Objects.hashCode(this.email);
        hash = 31 * hash + Objects.hashCode(this.anrede);
        hash = 31 * hash + Objects.hashCode(this.vorname);
        hash = 31 * hash + Objects.hashCode(this.name);
        hash = 31 * hash + Objects.hashCode(this.geburtsdatum);
        hash = 31 * hash + Objects.hashCode(this.strasse);
        hash = 31 * hash + Objects.hashCode(this.plz);
        hash = 31 * hash + Objects.hashCode(this.wohnort);
        hash = 31 * hash + Objects.hashCode(this.telefonnummer);
        hash = 31 * hash + (this.merkblatt ? 1 : 0);
        hash = 31 * hash + (this.datenschutz ? 1 : 0);
        hash = 31 * hash + Objects.hashCode(this.anzahlBewertungen);
        hash = 31 * hash + Objects.hashCode(this.bewertungspunkteInsgesammt);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Anbieter other = (Anbieter) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
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
        if (!Objects.equals(this.geburtsdatum, other.geburtsdatum)) {
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
        if (this.merkblatt != other.merkblatt) {
            return false;
        }
        if (this.datenschutz != other.datenschutz) {
            return false;
        }
        if (!Objects.equals(this.anzahlBewertungen, other.anzahlBewertungen)) {
            return false;
        }
        if (!Objects.equals(this.bewertungspunkteInsgesammt, other.bewertungspunkteInsgesammt)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Anbieter{" + "id=" + id + ", email=" + email + ", anrede=" + anrede + ", vorname=" + vorname + ", name=" + name + ", geburtsdatum=" + geburtsdatum + ", strasse=" + strasse + ", plz=" + plz + ", wohnort=" + wohnort + ", telefonnummer=" + telefonnummer + ", merkblatt=" + merkblatt + ", datenschutz=" + datenschutz + ", anzahlBewertungen=" + anzahlBewertungen + ", bewertungspunkteInsgesammt=" + bewertungspunkteInsgesammt + '}';
    }

    
}
