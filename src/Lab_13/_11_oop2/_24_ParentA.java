/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_13._11_oop2;

/**
 * @author AHMED ABUWARDA.
 */
public class _24_ParentA {

    // Print method.
    public void print() {

        System.out.println("ParentA");

    }

    /**
     * Foo method.
     *
     * @return Foo.
     */
    String foo() {

        return "Foo";

    }

}

/**
 * New Class.
 *
 * @author AHMED ABUWARDA.
 */
class ChildA extends _24_ParentA {

    // Override print method.
    @Override
    public void print() {

        System.out.println(this.show());
        System.out.println(foo());
        System.out.println("ChildA");

    }

    /**
     * Show method.
     *
     * @return ChildA_1.
     */
    public String show() {

        return "ChildA_1";

    }

}

/**
 * New Class.
 *
 * @author AHMED ABUWARDA.
 */
class ChildB extends ChildA {

    /**
     * Override show method.
     *
     * @return ChildB_1.
     */
    @Override
    public String show() {

        return "ChildB_1";

    }

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        // Creating new object.
        ChildB childB = new ChildB();
        childB.print();

    }

}