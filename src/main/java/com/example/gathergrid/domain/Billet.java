package com.example.gathergrid.domain;

import com.example.gathergrid.domain.enums.BilletType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Billet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double prix;
    private int quantiteDisponible;
    private BilletType billetType;


    public Billet(double prix, int quantiteDisponible, BilletType billetType) {
        this.prix = prix;
        this.quantiteDisponible = quantiteDisponible;
        this.billetType = billetType;
    }

    public Billet() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQuantiteDisponible() {
        return quantiteDisponible;
    }

    public void setQuantiteDisponible(int quantiteDisponible) {
        this.quantiteDisponible = quantiteDisponible;
    }

    public BilletType getBilletType() {
        return billetType;
    }

    public void setBilletType(BilletType billetType) {
        this.billetType = billetType;
    }

    @Override
    public String toString() {
        return "Billet{" +
                "prix=" + prix +
                ", quantiteDisponible=" + quantiteDisponible +
                ", billetType=" + billetType +
                '}';
    }


}
