/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_13._05_oop2;

/**
 * @author AHMED ABUWARDA.
 */
class _09_Parent {

    // Constructor.
    _09_Parent() {

        System.out.println("Parent");

    }

    _09_Parent(int i) {

        System.out.println("Parent + " + i);

    }

}

/**
 * Child 1 class.
 *
 * @author AHMED ABUWARDA.
 */
class Child_1 extends _09_Parent {

    // Constructor.
    Child_1() {

        super(5);
        System.out.println("Child_1");

    }

    /**
     * Another Constructor.
     *
     * @param i An int number.
     */
    public Child_1(int i) {

        System.out.println("Child_1 + " + i);

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