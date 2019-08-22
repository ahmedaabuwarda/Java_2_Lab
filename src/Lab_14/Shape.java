/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_14;

/**
 * @author AHMED ABUWARDA.
 */
public class Shape {

    // Constructor.
    Shape() {

    }

    /**
     * @return general.
     */
    public String print() {
        return "General";
    }

}

// Circle Class.
class Circle extends Shape {

    Circle() {

    }

    /**
     * @return Circle.
     */
    @Override
    public String print() {
        return "Circle";
    }

}

/**
 * New class.
 *
 * @author AHMED ABUWARDA.
 */
class Rectangle extends Shape {

    // Constructor.
    Rectangle() {

    }

    /**
     * @return rectangle.
     */
    @Override
    public String print() {
        return "Rectangle";
    }

}