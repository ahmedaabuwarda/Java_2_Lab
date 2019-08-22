/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_15.imp1;

/**
 * @author AHMED ABUWARDA.
 */
public interface Drawable {

    void drow();

}

// Rectangle class.
class Rectangle implements Drawable {

    @Override
    public void drow() {

        System.out.println("drawing rectangle");

    }

}

// Circle class.
class Circle implements Drawable {

    @Override
    public void drow() {

        System.out.println("drawing circle");

    }

}

//TestInterface class.
class TestInterface1 {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        Drawable drRec = new Rectangle();
        drRec.drow();
        Drawable drCir = new Circle();
        drCir.drow();

    }

}