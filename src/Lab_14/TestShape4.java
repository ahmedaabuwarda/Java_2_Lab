/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_14;

/**
 * @author AHMED ABUWARDA.
 */
public class TestShape4 {

    public static void main(String[] args) {
        // TODO code application logic here.

        Shape shape = new Shape();
        Circle cir = new Circle();
        Rectangle rect = new Rectangle();

        System.out.println(show(shape));    // General
        System.out.println(show(cir));      // Circle
        System.out.println(show(rect));     // Rectangle

    }

    /**
     * @param shape Shape object
     * @return Print method.
     */
    private static String show(Shape shape) {
        return shape.print();
    }

}