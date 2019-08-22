/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_13._09_oop2;

/**
 *
 * @author AHMED ABUWARDA
 */
public class _17_Parent {
    
    /**
     * Constructor
     * @param n 
     */
    public _17_Parent(int n){
        
        System.out.println("Parent " + n);
        
    }
    
}

/**
 * New Class
 * 
 * @author AHMED ABUWARDA
 */
class Child_1 extends _17_Parent{
    
    /**
     * Constructor
     */
    public Child_1(){
        
        this(3);        // need to this
        System.out.println("Child_1");
        
    }
    
    /**
     * Another constructor
     * @param n 
     */
    public Child_1(int n){
        
        super(2);       // need to this
        System.out.println("Child_1" + n);
        
    }
    
}
