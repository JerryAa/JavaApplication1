/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.io.*; 
import java.util.*; 
import java.math.*; 
import java.time.*; 

/**
 *
 * @author jerrya
 */
public class Students {
    private String firstName;
    private String lastName; 
    private int id; 
    public Students(int val) { 
        this.id = val; 
        
    }
    
    public void setFirstName(String  value){ 
    
          this.firstName = value; 
          
    }
    public String getFirstName(){ 
              return firstName;   

    }
    
    public void  setLastName(String value) 
    { 
        this.lastName = value; 
    }
    
    public String getLastName() 
    { 
              return lastName; 

    }

    public int getId() {
        return this.id; 
    }
}
