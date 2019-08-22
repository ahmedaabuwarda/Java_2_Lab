/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_15.imp2;

/**
 * @author AHMED ABUWARDA.
 */
public interface Printable1 {

    void print();

}

interface Showable1 extends Printable1 {

    void show();

}

// Testinterface2 class.
class Testinterface2 implements Showable1 {

    @Override
    public void print() {

        System.out.println("Hello");

    }

    @Override
    public void show() {

        System.out.println("Welcome");

    }

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        Testinterface2 test = new Testinterface2();
        test.print();
        test.show();

    }

}