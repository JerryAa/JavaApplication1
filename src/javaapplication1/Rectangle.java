/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author jerrya
 */

import java.lang.Math; 
import java.io.*; 


public class Rectangle extends Shape {
    private double  diagnol; 
    
    public Rectangle(int l, int w) { 
           super(l,w ); 
    }

    @Override 
    public double area() { 
        return super.length * super.width; 
    } 
    public double  diagnol() {
        diagnol =  Math.sqrt(Math.pow(super.length, 2) + Math.pow(super.width, 2)); 
        return diagnol; 
    }
}
