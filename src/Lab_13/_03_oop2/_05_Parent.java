/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_13._03_oop2;

/**
 * Parent class
 * 
 * @author AHMED ABUWARDA
 */
public class _05_Parent {
    
    /**
     * Constructor
     */
    public _05_Parent() {

        System.out.println("Parent");

    }
}

/**
 * Child 1 class
 * 
 * @author AHMED ABUWARDA
 */
class Child_1 extends _05_Parent {

    /**
     * Constructor
     */
    public Child_1() {

        this.print();
        System.out.println("Chlid_1");

    }

    /**
     * Print method
     */
    public void print() {

        System.out.println("Child_1 again");

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
