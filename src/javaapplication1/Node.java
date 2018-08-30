/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author jerrya
 * 
 * 
 * Linked list 
 */
public class Node {
     Node next = null; 
    
    private int data; 
    
    public Node(int d){ 
        this.data = d; 
    }
    // inserting to end 
    void insert(int d) {
        Node end = new Node(d); 
        Node n = this; 
        while (n.next != null) 
            n = n.next; 
        n.next = end; 
    }
    
}
