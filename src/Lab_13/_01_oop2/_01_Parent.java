/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_13._01_oop2;

/**
 * @author AHMED ABUWARDA.
 */
class _01_Parent {

    // Method to print the result.
    void parent1() {

        System.out.println("Parent Method");

    }

}

/**
 * Another class
 *
 * @author AHMED ABUWARDA
 */
class _01_Child extends _01_Parent {

    // Method to print the result.
    void child1() {

        System.out.println("Chiled Method");

    }

}