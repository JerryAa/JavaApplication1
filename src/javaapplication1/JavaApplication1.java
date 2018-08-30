/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;
import java.util.Random;
import java.io.*;
import java.util.*;

public class JavaApplication1 {

    public JavaApplication1() {

    }

    public static void main(String[] args) {
        Random rnd = new Random();

        // Scanner scn = new Scanner(System.in); 
        try {
            // int vaule = Integer.parseInt(scn.nextLine()); 
            int value = rnd.nextInt(1000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        HashMap<Students, Integer> hsm = new HashMap<Students, Integer>();
        int id1 = rnd.nextInt(100000);

        Students st1 = new Students(id1);
        st1.setFirstName("John");
        st1.setLastName("Doe");
        hsm.put(st1, id1);

        int id2 = rnd.nextInt(100000);
        Students st2 = new Students(id2);
        st2.setFirstName("Mike");
        st2.setLastName("James");

        hsm.put(st2, id2);

        for (Students tmp : hsm.keySet()) {
            System.out.println("First Name: " + tmp.getFirstName() + "     " + "Last Name: " + tmp.getLastName() + "     " + "ID: " + tmp.getId());

        }

        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            arr.add(rnd.nextInt(100));

        }
        for (int val : arr) {
            System.out.println(val);
        }

        String sentence = "This is so fun";
        String[] arr2 = sentence.split(" ");

        for (String s : arr2) {
            System.out.println(s);
        }
               
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Enter the length: "); 
        int length = sc.nextInt(); 
        
        System.out.println("Enter the width: "); 
        int width = sc.nextInt(); 
        
        Rectangle r = new Rectangle(length ,width  ); 
        r.area(); 
        
        Shape s = new Rectangle(length, width); 
        s.area(); 
        
        double  d = ((Rectangle)s).diagnol(); // down casting 
 
    
        System.out.println("The length " + length + " The width " + width + " The diagnol is " + d ); 
        
    }

}
