/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.matchit.Model;

import java.util.Objects;
import java.time.Period;  
import java.time.LocalDate;  

/**
 *
 * @author msaliett
 */
public class Candidate {
    
    private String name;
    private String surname;
    private String email;
    private LocalDate Dob;
    private String language;

    public Candidate() {
    }

    public Candidate(String name, String surname, String email, LocalDate Dob, String language) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.Dob = Dob;
        this.language = language;
    }

    public Candidate(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return Dob;
    }

    public void setDob(LocalDate Dob) {
        this.Dob = Dob;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.email);
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
        final Candidate other = (Candidate) obj;
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }
    
    public int calculateAge(){
        return  Period.between(this.Dob, LocalDate.now()).getYears();  
       
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Candidate{name=").append(name);
        sb.append(", surname=").append(surname);
        sb.append(", email=").append(email);
        sb.append(", Dob=").append(Dob);
        sb.append(", language=").append(language);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
