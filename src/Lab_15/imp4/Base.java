/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_15.imp4;

/**
 * @author AHMED ABUWARDA.
 */
abstract class Base {

    int x = 2;

    Base() {

        System.out.println("x = " + x);
        x++;

    }

    abstract int calculate();

    abstract int calculate(int i);

}

// MySuper class.
class MySuper extends Base {

    MySuper() {

        System.out.println("x = " + calculate(2));

    }

    @Override
    int calculate() {

        return x;

    }

    /**
     * @param i An int number.
     * @return i * x.
     */
    @Override
    int calculate(int i) {

        return i * x;

    }

}

// Sub class.
class Sub extends MySuper {

    @Override
    int calculate() {

        return x + 2;

    }

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        Sub sub = new Sub();
        System.out.println("x = " + sub.calculate());

    }

}