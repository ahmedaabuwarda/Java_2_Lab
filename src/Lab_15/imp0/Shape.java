/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_15.imp0;

/**
 * @author AHMED ABUWARDA.
 */
abstract class Shape {

    abstract void drow();

}

// Rectangle class.
class Rectangle extends Shape {

    @Override
    void drow() {

        System.out.println("drawing rectangle");

    }

}

// Circle class.
class Circle extends Shape {

    @Override
    void drow() {

        System.out.println("drawing circle");

    }

}

// TestAbstraction1 class.
class TestAbstraction1 {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        Shape s = new Circle();
        s.drow();

    }

}