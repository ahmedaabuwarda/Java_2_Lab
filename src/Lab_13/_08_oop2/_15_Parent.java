/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_13._08_oop2;

/**
 * @author AHMED ABUWARDA.
 */
public class _15_Parent {

    // Constructor.
    _15_Parent() {

    }

    // Print method.
    public void print() {

        System.out.println("Parent");

    }

}

/**
 * Child 1 class.
 *
 * @author AHMED ABUWARDA.
 */
class Child_1 extends _15_Parent {

    // Constructor.
    Child_1() {

    }

    // Override print method.
    @Override
    public void print() {

        System.out.println("Child_1");

    }

}

/**
 * Child 2 class.
 *
 * @author AHMED ABUWARDA.
 */
class Child_2 extends Child_1 {

    // Constructor.
    Child_2() {

    }

    // Override print method.
    @Override
    public void print() {

        System.out.println("Child_2");

    }

}