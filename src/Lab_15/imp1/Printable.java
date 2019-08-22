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
public interface Printable {
    
    void print();
    
    void copy(int i);
    
}

class Print1 implements Printable{
    
    @Override
    public void print(){
        
        System.out.println("Hello");
        
    }
    
    @Override
    public void copy(int i){
        
        System.out.println("Hello" + i);
        
    }
    
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        Printable p = new Print1();
        p.print();
        p.copy(5);
        
    }
    
}