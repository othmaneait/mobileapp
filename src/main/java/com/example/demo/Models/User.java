package com.example.demo.Models;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int age ;
    private int sexe ;
    private String preference ;
    private  int pricemin;
    private int pricemax;
    private boolean handicap ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSexe() {
        return sexe;
    }

    public void setSexe(int sexe) {
        this.sexe = sexe;
    }

    public String getPreference() {
        return preference;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }

    public int getPricemin() {
        return pricemin;
    }

    public void setPricemin(int pricemin) {
        this.pricemin = pricemin;
    }

    public int getPricemax() {
        return pricemax;
    }

    public void setPricemax(int pricemax) {
        this.pricemax = pricemax;
    }

    public boolean isHandicap() {
        return handicap;
    }

    public void setHandicap(boolean handicap) {
        this.handicap = handicap;
    }


}
