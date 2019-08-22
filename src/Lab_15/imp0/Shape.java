/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_15.imp0;

/**
 *
 * @author AHMED ABUWARDA
 */
public abstract class Shape {
    
    abstract void drow();
    
}

/**
 * 
 * @author AHMED ABUWARDA
 */
class Rectangle extends Shape {
    
    @Override
    void drow(){
        
        System.out.println("drawing rectangle");
        
    }
    
}

/**
 * 
 * @author AHMED ABUWARDA
 */
class Circle extends Shape {
    
    @Override
    void drow(){
        
        System.out.println("drawing circle");
        
    }
    
}

/**
 * 
 * @author AHMED ABUWARDA
 */
class TestAbstraction1 {
    
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        Shape s = new Circle();
        s.drow();
        
    }
    
}