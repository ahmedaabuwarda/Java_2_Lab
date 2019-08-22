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
public class TestShape2 {

    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        Shape shape = new Shape();
        Circle cir = new Circle();
        Rectangle rect = new Rectangle();
        
        Shape shape_cir = new Circle();
        Shape shape_rect = new Rectangle();
        
        System.out.println(shape_cir.print());      // Circle
        System.out.println(shape_rect.print());     // Rectangle
        
    }

}
