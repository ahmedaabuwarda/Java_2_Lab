/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_14;

/**
 *
 * @author AHMED ABUWARDA
 */
public class Shape {

    /**
     * Constructor
     */
    public Shape() {
        
    }

    /**
     * @return general
     */
    public String print() {
        
        return "General";
        
    }
}

class Circle extends Shape {

    public Circle() {
        
    }

    /**
     * @return Circle
     */
    @Override
    public String print() {
        
        return "Circle";
        
    }
}

/**
 * New class
 * @author AHMED ABUWARDA
 */
class Rectangle extends Shape {

    /**
     * Constructor
     */
    public Rectangle() {
        
    }

    /**
     * @return rectangle
     */
    @Override
    public String print() {
        
        return "Rectangle";
        
    }

}
