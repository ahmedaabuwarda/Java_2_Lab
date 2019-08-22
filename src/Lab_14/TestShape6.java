/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_14;

/**
 * @author AHMED ABUWARDA.
 */
public class TestShape6 {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        Shape shape = new Shape();
        Circle cir = new Circle();
        Rectangle rect = new Rectangle();

        // Shape2 shape2 = new Shape2();
        // System.out.println(show(shape2));

    }

    /**
     * @param obj Obj object.
     * @return Print method.
     */
    public static String show(Object obj) {

        if (obj instanceof Shape) {

            return ((Shape) obj).print();

        }

        return "No value";

    }

}