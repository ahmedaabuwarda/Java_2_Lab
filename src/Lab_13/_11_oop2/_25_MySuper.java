/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_13._11_oop2;

/**
 *
 * @author AHMED ABUWARDA
 */
public class _25_MySuper {

    int m = 1;

    public _25_MySuper() {

        myMethod();

    }

    /**
     * myMethod method
     */
    void myMethod() {
        System.out.println("X = m");
    }

}

/**
 * New class
 *
 * @author AHMED ABUWARDA
 */
class MySub extends _25_MySuper {

    int n = 2;

    /**
     * Override myMethod method
     */
    @Override
    void myMethod() {

        System.out.println("X = " + n);

    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        /**
         * Create new object
         */
        MySub mysub = new MySub();

    }

}
