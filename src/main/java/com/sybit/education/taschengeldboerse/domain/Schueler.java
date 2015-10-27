/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sybit.education.taschengeldboerse.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author ssr
 */
@Entity(name = "schueler")
public class Schueler implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    
    @NotEmpty(message="Bitte Vorname eingeben")
    @Column
    private String vorname;
    
    @Column
    private String anrede;
    
    @NotEmpty(message="Bitte Name eingeben")
    @Column
    private String name;

    @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\."
        +"[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@"
        +"(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?",
             message="Bitte eine gültige E-Mail angeben.")
    @Column(unique = true, nullable = false)
    private String email;
    @Column
    private String telefon;
    @NotEmpty(message="Bitte Straße eingeben")
    @Column
    private String strasse;
    @NotEmpty(message="Bitte Plz/Wohnort eingeben")
    @Column
    private String plz;
    @NotEmpty()
    @Column
    private String wohnort;
    @NotEmpty(message="Bitte Geburtsdatum eingeben")
    @Column
    private String geburtsdatum;
    @Column(name = "job_beschreibung")
    private String jobBeschreibung;
    @Column(name = "job_zeit")
    private String jobZeit;
    
    @Column(name = "haftpflichtversicherung")
    private Boolean hatHaftpflichtVers;
    
    @Column(name = "unfallversicherung")
    private Boolean hatUnfallVers;
    
    @Column(name = "merkblatt")
    private Boolean hatMerkblattGelesen;
    
    @Column(name = "datenschutz")
    private Boolean hatDatenschutzGelesen;

    public Schueler() {
    }

    public Schueler(User user) {
        this.email = user.getEmail();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStrasse() {
        return strasse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
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

    public void setWohnort(String wohnort) {
        this.wohnort = wohnort;
    }

    public String getJobBeschreibung() {
        return jobBeschreibung;
    }

    public void setJobBeschreibung(String jobBeschreibung) {
        this.jobBeschreibung = jobBeschreibung;
    }

    public String getJobZeit() {
        return jobZeit;
    }

    public void setJobZeit(String jobZeit) {
        this.jobZeit = jobZeit;
    }

    public Boolean getHatHaftpflichtVers() {
        return hatHaftpflichtVers;
    }

    public void setHatHaftpflichtVers(Boolean hatHaftpflichtVers) {
        this.hatHaftpflichtVers = hatHaftpflichtVers;
    }

    public Boolean getHatUnfallVers() {
        return hatUnfallVers;
    }

    public void setHatUnfallVers(Boolean hatUnfallVers) {
        this.hatUnfallVers = hatUnfallVers;
    }

    public Boolean getHatMerkblattGelesen() {
        return hatMerkblattGelesen;
    }

    public void setHatMerkblattGelesen(Boolean hatMerkblattGelesen) {
        this.hatMerkblattGelesen = hatMerkblattGelesen;
    }

    public Boolean getHatDatenschutzGelesen() {
        return hatDatenschutzGelesen;
    }

    public void setHatDatenschutzGelesen(Boolean hatDatenschutzGelesen) {
        this.hatDatenschutzGelesen = hatDatenschutzGelesen;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(String geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnrede() {
        return anrede;
    }

    public void setAnrede(String anrede) {
        this.anrede = anrede;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

}
