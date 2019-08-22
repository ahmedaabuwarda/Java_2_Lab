/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_13._01_oop2;

/**
 *
 * @author AHMED ABUWARDA
 */
public class _01_Parent {

    /**
     * Method to print the result
     */
    public void parent1() {

        System.out.println("Parent Method");

    }
}

/**
 * Another class
 * 
 * @author AHMED ABUWARDA
 */
class _01_Child extends _01_Parent {

    /**
     * Method to print the result
     */
    public void child1() {

        System.out.println("Chiled Method");

    }

}
