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
public abstract class Bike {

    Bike(){
        
        System.out.println("Bike is created");
    
    }
    
    abstract void run();
    
    void changeGear(){
        
        System.out.println("Gear changed");
    
    }
}

class Honda extends Bike {
    
    @Override
    void run(){
        
        System.out.println("Running safely..");
        
    }
    
}

class TestAbstraction2 {
    
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
       Bike b = new Honda();
       b.run();
       b.changeGear();
        
    }
    
}