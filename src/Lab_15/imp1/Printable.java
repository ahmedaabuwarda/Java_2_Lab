/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_15.imp1;

/**
 * @author AHMED ABUWARDA.
 */
public interface Printable {

    void print();

    void copy(int i);

}

// Print1 class.
class Print1 implements Printable {

    @Override
    public void print() {

        System.out.println("Hello");

    }

    /**
     * @param i An int number.
     */
    @Override
    public void copy(int i) {

        System.out.println("Hello" + i);

    }

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        Printable p = new Print1();
        p.print();
        p.copy(5);

    }

}