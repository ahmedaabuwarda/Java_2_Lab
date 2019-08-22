/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_13._03_oop2;

/**
 * Parent class.
 *
 * @author AHMED ABUWARDA.
 */
class _05_Parent {

    // Constructor.
    _05_Parent() {

        System.out.println("Parent");

    }

}

/**
 * Child 1 class.
 *
 * @author AHMED ABUWARDA.
 */
class Child_1 extends _05_Parent {

    // Constructor.
    Child_1() {

        this.print();
        System.out.println("Chlid_1");

    }

    // Print method.
    public void print() {

        System.out.println("Child_1 again");

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

        System.out.println("Child_2");

    }

}