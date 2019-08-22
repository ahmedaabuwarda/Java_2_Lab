/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_13._02_oop2;

/**
 * Default class for parent.
 *
 * @author AHMED ABUWARDA.
 */
public class _03_Parent {

    // Parent constructor.
    public _03_Parent() {

        System.out.println("Parent");

    }

}

/**
 * Another class for Child 1.
 *
 * @author AHMED ABUWARDA.
 */
class Child_1 extends _03_Parent {

    // Child 1 constructor.
    Child_1() {

        System.out.println("Child_1");

    }

}

/**
 * Another class for Child 2
 *
 * @author AHMED ABUWARDA.
 */
class Child_2 extends Child_1 {

    // Child 2 constructor.
    Child_2() {

        System.out.println("Child_2");

    }

}