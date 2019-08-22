/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_13._10_oop2;

/**
 * @author AHMED ABUWARDA.
 */
public class _23_ParentA {

    protected int a = 2;
    private int b = 3;

    // Constructor.
    private _23_ParentA() {

        a += 1;
        b += 2;
        System.out.println("b = " + b);

    }

    /**
     * Constructor.
     *
     * @param i An int number.
     */
    _23_ParentA(int i) {

        this();
        b -= 1;
        System.out.println("a = " + a);
        a -= 1;

    }

    /**
     * Get b method.
     *
     * @return b - a.
     */
    int getB() {

        this.a += 2;
        this.b += 4;
        return b - a;

    }

}

/**
 * New Class.
 *
 * @author AHMED ABUWARDA.
 */
class Child_A extends _23_ParentA {

    int a;
    int b = 1;

    // Constructor.
    Child_A() {

        super(3);
        a += 7;
        b += 5;

    }

}

/**
 * New Class.
 *
 * @author AHMED ABUWARDA.
 */
class Child_B extends Child_A {

    // Constructor.
    private Child_B() {

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("b = " + getB());

    }

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        // Create new object.
        Child_B ChildB = new Child_B();

    }

}