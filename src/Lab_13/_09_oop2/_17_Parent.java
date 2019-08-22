/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_13._09_oop2;

/**
 * @author AHMED ABUWARDA.
 */
class _17_Parent {

    /**
     * Constructor.
     *
     * @param n An int number.
     */
    _17_Parent(int n) {

        System.out.println("Parent " + n);

    }

}

/**
 * New Class.
 *
 * @author AHMED ABUWARDA.
 */
class Child_1 extends _17_Parent {

    // Constructor.
    Child_1() {

        this(3);        // need to this
        System.out.println("Child_1");

    }

    /**
     * Another constructor.
     *
     * @param n An int number.
     */
    private Child_1(int n) {

        super(2);       // need to this
        System.out.println("Child_1" + n);

    }

}