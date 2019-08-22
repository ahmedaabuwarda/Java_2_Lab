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
public class TestShape4 {

    public static void main(String[] args) {
        
        Shape shape = new Shape();
        Circle cir = new Circle();
        Rectangle rect = new Rectangle();
        
        System.out.println(show(shape));    // General
        System.out.println(show(cir));      // Circle
        System.out.println(show(rect));     // Rectangle
        
    }

    public static String show(Shape shape) {
        
        return shape.print();
        
    }

}
