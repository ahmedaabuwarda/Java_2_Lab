/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_13._07_oop2;

/**
 * @author AHMED ABUWARDA.
 */
public class _13_Parent {

    // Constructor.
    public _13_Parent() {

    }

    // Print method.
    public void print() {

        System.out.println("Parent");

    }
}

/**
 * Child class.
 *
 * @author AHMED ABUWARDA.
 */
class Child extends _13_Parent {

    // Constructor.
    public Child() {

    }

    // Print method.
    @Override
    public void print() {

        System.out.println("Child");

    }

    // If you want to Overload the previous method...
    public void print(int i) {

        System.out.println("Chlid + " + i);

    }

}