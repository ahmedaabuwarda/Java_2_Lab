/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_13._04_oop2;

/**
 * Parent class
 *
 * @author AHMED ABUWARDA
 */
public class _07_Parent {

    /**
     * Constructor
     */
    public _07_Parent() {

        System.out.println("Parent");

    }

}

/**
 * Child 1 class
 * 
 * @author AHMED ABUWARDA
 */
class Child_1 extends _07_Parent {

    /**
     * Constructor
     */
    public Child_1() {

        this(5);
        System.out.println("Child_1");

    }
    
    /**
     * Another Constructor
     * 
     * @param i 
     */
    public Child_1(int i){
        
        System.out.println("Child_1 + " + i);
    
    }
}

/**
 * Child 2 class
 * 
 * @author AHMED ABUWARDA
 */
class Child_2 extends Child_1 {
   
    /**
     * Constructor
     */
    public Child_2(){
        
        System.out.println("Child_2");
        
    }
    
}
