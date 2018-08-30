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
public class Shape {
    
    protected int length; 
    protected int width; 
    
    public Shape(int l, int w) { 
        this.length = l; 
        this.width = w; 
               
    }
    public double  area() { 
        return this.length * this.width*1.0; 
        
    }
    public int perimeter() {
        return 2 * width + 2 * length; 
    }
}
