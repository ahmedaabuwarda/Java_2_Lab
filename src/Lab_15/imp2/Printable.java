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
public interface Printable {
    
    void print();
    
}

interface Showable {
    
    void show();
    
}

class Multi implements Printable, Showable {
    
    @Override
    public void print(){
        
        System.out.println("Hello");
        
    }
    
    @Override
    public void show(){
        
        System.out.println("Welcome");
        
    }
    
    public static void main(String[] args) {
        
        Printable pr = new Multi();
        pr.print();
        
        Showable sh = new Multi();
        sh.show();
        
        Multi obj = new Multi();
        obj.print();
        obj.show();
            
    }
    
}