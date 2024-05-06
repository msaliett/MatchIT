/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.matchit;

import com.mycompany.matchit.Model.Candidate;
import com.mycompany.matchit.Model.Model;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.List;

/**
 *
 * @author msaliett
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Model myModel = new Model();
        boolean result1 = myModel.signUp (new Candidate("name1", "surname2","mail@mail.com",LocalDate.of(1980,1,1),"catalan"));
        System.out.println(result1);
        List candidates = myModel.getCandidates();
        System.out.println(candidates);
        boolean result2 = myModel.signUp (new Candidate("name2", "surname22","mail@mail.com",LocalDate.of(1980,1,1),"catalan"));
        System.out.println(result2);
        List candidates2 = myModel.getCandidates();
        System.out.println(candidates2);
    }
    
}
