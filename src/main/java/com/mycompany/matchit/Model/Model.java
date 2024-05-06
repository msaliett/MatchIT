/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matchit.Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author msaliett
 */
public class Model {
    private List<Candidate> candidates;

    public Model() {
        candidates = new ArrayList<>();
    }

    public Model(List<Candidate> candidates) {
        this.candidates = candidates;
    }
    /**
     * Adds the newCandidate to data source
     * @param newCandidate  new candidate to register
     * @return true is candidate is added to data source
     * @throws InvalidDoBException if candidate is under 18
     * @throws DuplicatedCandidateException if email's candidate already exists
    */
    public boolean signUp (Candidate newCandidate) throws InvalidDoBException,
                                                 DuplicatedCandidateException {

        boolean result = false;
        //Chek age
        if (newCandidate.calculateAge() <18) {
            throw new InvalidDoBException("A candidate cannot be under 18 years");
        } 
        if (candidates.contains(newCandidate)){
            throw new DuplicatedCandidateException("This e-mail already exists");
        } else {
            candidates.add(newCandidate);
            result = true;
        }
        return result;
    }

 

    public List<Candidate> getCandidates() {
        return candidates;
    }

    
    
    
}
