/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_13._01_oop2;

import Lab_13._01_oop2._01_Parent;

/**
 *
 * @author AHMED ABUWARDA
 */
public class _02_TestParent {
    
    /**
     * 
     * @param args the command line here
     */
    public static void main(String[] args) {
        
        /**
         * Create new child object
         */
        _01_Child child = new _01_Child();
        
        // Print child class method
        child.child1();
        
        // Print parent class method
        child.parent1();
        
    }
    
}
