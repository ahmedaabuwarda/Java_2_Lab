/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_14;

/**
 * @author AHMED ABUWARDA.
 */
public class TestShape5 {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {

        Shape shape = new Shape();
        Circle cir = new Circle();
        Rectangle rect = new Rectangle();

        // Shape2 shape2 = new Shape2();     // Error
        System.out.println(show(shape));     // shape2 >> Error

    }

    /**
     * @param shape Shape object.
     * @return Print method.
     */
    private static String show(Shape shape) {
        return shape.print();
    }

}