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
public class Rectangle extends Shape {
    
    public Rectangle(int l, int w) { 
           super(l,w ); 
    }
    
    @Override 
    public double area() { 
        return super.length * super.width; 
    } 
}
