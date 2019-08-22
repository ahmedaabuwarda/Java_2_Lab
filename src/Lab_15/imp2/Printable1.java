/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_15.imp2;

/**
 *
 * @author AHMED ABUWARDA
 */
public interface Printable1 {
    
    void print();
    
}

interface Showable1 extends Printable1 {
    
    void show();
    
}

class Testinterface2 implements Showable1 {
    
    @Override
    public void print(){
        
        System.out.println("Hello");
        
    }
    
    @Override
    public void show(){
     
        System.out.println("Welcome");
        
    }
    
    public static void main(String[] args) {
        
        Testinterface2 test = new Testinterface2();
        test.print();
        test.show();
        
    }
    
}