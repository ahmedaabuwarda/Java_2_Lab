/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_15.imp1;

/**
 *
 * @author AHMED ABUWARDA
 */
public interface Drawable {

    void drow();
    
}

class Rectangle implements Drawable {
    
    @Override
    public void drow(){
        
        System.out.println("drawing rectangle");
        
    }
    
}

class Circle implements Drawable {
    
    @Override
    public void drow(){
        
        System.out.println("drawing circle");
        
    }
    
}

class TestInterface1 {
    
    public static void main(String[] args) {
        
        Drawable drRec = new Rectangle();
        drRec.drow();
        Drawable drCir = new Circle();
        drCir.drow();
        
    }
    
}