/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_13._08_oop2;

/**
 *
 * @author AHMED ABUWARDA
 */
public class _15_Parent {

    /**
     * Constructor
     */
    public _15_Parent() {

    }

    /**
     * Print method
     */
    public void print() {

        System.out.println("Parent");

    }

}

/**
 * Child 1 class
 *
 * @author AHMED ABUWARDA
 */
class Child_1 extends _15_Parent {

    /**
     * Constructor
     */
    public Child_1() {

    }

    /**
     * Override print method
     */
    @Override
    public void print() {

        System.out.println("Child_1");

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
    public Child_2() {

    }

    /**
     * Override print method
     */
    @Override
    public void print() {

        System.out.println("Child_2");

    }

}
