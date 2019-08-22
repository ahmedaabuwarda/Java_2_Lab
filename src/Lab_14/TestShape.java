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
public class TestShape {

    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        Shape shape = new Shape();
        Circle cir = new Circle();
        Rectangle rect = new Rectangle();
        
        System.out.println(shape.print());  // General
        System.out.println(cir.print());    // Circle
        System.out.println(rect.print());   // Rectangle
        
    }

}
