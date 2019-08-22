/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_13._10_oop2;

/**
 *
 * @author AHMED ABUWARDA
 */
public class _21_AandB {

    /**
     * Print method
     */
    public void print() {

        System.out.println("I'm A");

    }

    /**
     * Get Data method
     */
    public void getData() {

        print();

    }

}

/**
 * New Class
 * 
 * @author AHMED ABUWARDA
 */
class B extends _21_AandB {

    /**
     * Override print method
     */
    @Override
    public void print() {

        System.out.println("I'm B");

    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        new B().getData();

    }

}
