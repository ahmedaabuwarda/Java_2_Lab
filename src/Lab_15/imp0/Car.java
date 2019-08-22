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
public abstract class Car {
    
    /**
     * Abstract method
     */
    abstract void run();
    
}

/**
 * New BMW class
 * @author AHMED ABUWARDA
 */
class BMW extends Car {

    /**
     * Overridden run method
     */
    @Override
    void run(){
        
        System.out.println("running");
        
    }
    
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        /**
         * Create new object
         */
        Car car1 = new BMW();
        /**
         * Run this method
         */
        car1.run();
        
    }

}
