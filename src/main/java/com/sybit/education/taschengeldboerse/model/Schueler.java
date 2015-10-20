/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sybit.education.taschengeldboerse.model;

import java.util.Date;

/**
 *
 * @author ssr
 */
public class Schueler extends User {

    private String vorname;

    private String anrede;

    private String name;

    private String telefon;

    private String strasse;

    private String plz;

    private String ort;
    
    private String geburtsdatum;

    private String jobBeschreibung;

    private String jobZeit;

    private Boolean hatHaftpflichtVers;

    private Boolean hatUnfallVers;

    private Boolean hatMerkblattGelesen;

    private Boolean hatDatenschutzGelesen;

    public String getStrasse() {
        return strasse;
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

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
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
