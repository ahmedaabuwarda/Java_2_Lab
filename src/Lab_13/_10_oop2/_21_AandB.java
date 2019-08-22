/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_13._10_oop2;

/**
 * @author AHMED ABUWARDA.
 */
public class _21_AandB {

    // Print method.
    public void print() {

        System.out.println("I'm A");

    }

    // Get data method.
    void getData() {

        print();

    }

}

/**
 * New Class.
 * 
 * @author AHMED ABUWARDA.
 */
class B extends _21_AandB {

    // Override print method.
    @Override
    public void print() {

        System.out.println("I'm B");

    }

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        new B().getData();

    }

}