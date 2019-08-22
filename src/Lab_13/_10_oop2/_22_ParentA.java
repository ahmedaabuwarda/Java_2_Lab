/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_13._10_oop2;

/**
 * @author AHMED ABUWARDA.
 */
public class _22_ParentA {

    protected int b = 3;

    // Constructor.
    public _22_ParentA() {

        b += 3;
        System.out.println("b = " + b);

    }

    /**
     * Another Constructor.
     *
     * @param i An int number.
     */
    public _22_ParentA(int i) {

        this();
        b += 2;
        System.out.println("b = " + b);

    }
}

/**
 * New Class.
 *
 * @author AHMED ABUWARDA.
 */
class ChildA extends _22_ParentA {

    int b = 4;

    // Constructor.
    public ChildA() {

        super(3);
        b += 1;
        System.out.println("b = " + b);

    }

}

/**
 * New class.
 *
 * @author AHMED ABUWARDA.
 */
class ChildB extends ChildA {

    // Constructor.
    public ChildB() {

        b += 2;
        System.out.println("b = " + b);

    }

    public static void main(String[] args) {
        // TODO code application logic here.

        // Create new object.
        ChildB childB = new ChildB();

    }

}