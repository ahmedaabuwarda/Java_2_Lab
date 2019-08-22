/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_13._11_oop2;

/**
 * @author AHMED ABUWARDA.
 */
class _25_MySuper {

    int m = 1;

    _25_MySuper() {

        myMethod();

    }

    // myMethod method.
    void myMethod() {
        System.out.println("X = m");
    }

}

/**
 * New Class.
 *
 * @author AHMED ABUWARDA.
 */
class MySub extends _25_MySuper {

    int n = 2;

    // Override myMethod method.
    @Override
    void myMethod() {

        System.out.println("X = " + n);

    }

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        // Create new object.
        MySub mysub = new MySub();

    }

}