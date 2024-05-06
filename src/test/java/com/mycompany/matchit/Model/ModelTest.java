/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.matchit.Model;

import com.mycompany.matchit.Model.Candidate;
import com.mycompany.matchit.Model.DuplicatedCandidateException;
import com.mycompany.matchit.Model.InvalidDoBException;
import com.mycompany.matchit.Model.Model;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author msaliett
 */
public class ModelTest {
    
    
    private Model instance;
    
    public ModelTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
             
    }
    
    @AfterAll
    public static void tearDownClass() {

    }
    
    @BeforeEach
    public void setUp() {
         System.out.println("setUp  method called");
         // Create initial Candidates list
         List<Candidate> candidates = new ArrayList<>();
         candidates.add(new Candidate("name22", "surname22","mail22@mail.com",LocalDate.of(1980,1,1),"catalan"));
         //Instantiate class to test
         instance = new Model(candidates);
    }
    
    @AfterEach
    public void tearDown() {
      
    }

    /**
     * Test of signUp method, of class Model.
     */
    @Test
    public void signUpHP() {
        System.out.println("testSignUpHP");
        Candidate newCandidate = new Candidate("name21", "surname21","mail21@mail.com",LocalDate.of(1980,1,1),"catalan");
       
        boolean expResult = true;
      
        try {
            assertEquals(expResult, instance.signUp(newCandidate));
        } catch(Exception e) {
            fail("Error");
        }
    }

    @Test
    public void testSignUpDuplicated() {
        System.out.println("testSignUpDuplicated");
        Candidate newCandidate = new Candidate("name22", "surname22","mail22@mail.com",LocalDate.of(1980,1,1),"catalan");
        assertThrows(DuplicatedCandidateException.class, () -> {instance.signUp(newCandidate);});
       
    }
   @Test
     public void testSignUpMinor() {
        System.out.println("testSignUpMinor");
        Candidate newCandidate = new Candidate("name22", "surname22","mail21@mail.com",LocalDate.of(2020,1,1),"catalan");
        assertThrows(InvalidDoBException.class, ()-> {instance.signUp(newCandidate);});
       
    }
    
}

