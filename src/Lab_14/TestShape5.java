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
public class TestShape5 {

    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        Shape shape = new Shape();
        Circle cir = new Circle();
        Rectangle rect = new Rectangle();
        // Shape2 shape2 = new Shape2();     // Error
        System.out.println(show(shape));    // shape2 >> Error
    
    }

    public static String show(Shape shape) {
        
        return shape.print();
        
    }

}
