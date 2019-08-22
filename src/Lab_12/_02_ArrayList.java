/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_12;

import java.util.ArrayList;

/**
 *
 * @author AHMED ABUWARDA
 */
public class _02_ArrayList {
    
    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<String>();
        
        /**
         * add elements to ArrayList
         */
        names.add("Ahmed");
        names.add("Ali");
        names.add("Omar");
        
        /**
         * Loop Through an ArrayList to print the elements inside it
         */
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        
        /**
         * another method to print ArrayList elements
         */
        for (String i : names) {
            System.out.println(i);
        }
        
    }
}
