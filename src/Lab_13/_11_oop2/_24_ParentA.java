/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_13._11_oop2;

/**
 *
 * @author AHMED ABUWARDA
 */
public class _24_ParentA {

    /**
     * Print method
     */
    public void print() {

        System.out.println("ParentA");

    }

    /**
     * Foo method
     *
     * @return Foo
     */
    public String foo() {

        return "Foo";

    }

}

/**
 * New class
 *
 * @author AHMED ABUWARDA
 */
class ChildA extends _24_ParentA {

    /**
     * Override print method
     */
    @Override
    public void print() {

        System.out.println(this.show());
        System.out.println(foo());
        System.out.println("ChildA");

    }

    /**
     * Show method
     *
     * @return ChildA_1
     */
    public String show() {

        return "ChildA_1";

    }
}

/**
 * New class
 *
 * @author AHMED ABUWARDA
 */
class ChildB extends ChildA {

    /**
     * Override show method
     *
     * @return ChildB_1
     */
    @Override
    public String show() {

        return "ChildB_1";

    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        /**
         * Creating new object
         */
        ChildB childB = new ChildB();
        childB.print();

    }
}
