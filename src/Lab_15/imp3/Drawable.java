/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_15.imp3;

/**
 * @author AHMED ABUWARDA.
 */
public interface Drawable {

    void draw();

    /**
     * @param i An int number.
     * @return i * i * i.
     */
    static int cupe(int i) {

        return i * i * i;

    }

    default void print() {

        System.out.println("print");

    }

}

// Rectangle class.
class Rectangle implements Drawable {

    @Override
    public void draw() {

        System.out.println("drawing rectangle");

    }

}

// Testinterface3 class.
class Testinterface3 {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        Drawable dr = new Rectangle();
        dr.draw();
        dr.print();
        System.out.println(Drawable.cupe(8));

        Rectangle rec = new Rectangle();
        rec.draw();
        rec.print();

    }

}