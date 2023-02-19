package com.enset.Dao;

import java.text.SimpleDateFormat;
import java.util.Date;

//@Component
public final class PersonneImpl implements IPersonne {
    private String nom;
    private String prenom;
    private Date dateNais;

    public PersonneImpl(){}

    public PersonneImpl(String nom, String prenom, Date dateNais) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNais = dateNais;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAge() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return formatter.format(date);
    }

}
