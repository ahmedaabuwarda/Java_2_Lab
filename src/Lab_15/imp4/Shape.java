/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_15.imp4;

/**
 *
 * @author AHMED ABUWARDA
 */
public abstract class Shape {
    
    protected abstract double getArea(double length);

    protected abstract double getPerimeter(double length);
    
}

abstract class Square extends Shape {
    
    @Override
    public double getArea(double side) {
        
        return side * side;
        
    }
    
    public abstract double getPerimeter();
    
}

class Testprogram {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
        //Square s = new Square();
        //System.out.println(s.getArea(5));
        
    }
    
}
