/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_15.imp2;

/**
 * @author AHMED ABUWARDA.
 */
public interface Printable {

    void print();

}

interface Showable {

    void show();

}

// Multi class.
class Multi implements Printable, Showable {

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

        Printable pr = new Multi();
        pr.print();

        Showable sh = new Multi();
        sh.show();

        Multi obj = new Multi();
        obj.print();
        obj.show();

    }

}