package Lab_13._07_oop2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AHMED ABUWARDA
 */
public class _13_Parent {
    
    /**
     * Constructor
     */
    public _13_Parent(){
        
    }
    
    /**
     * Print Method
     */
    public void print(){
        
        System.out.println("Parent");
    
    }
}

/**
 * Child class
 * @author AHMED ABUWARDA
 */
class Child extends _13_Parent{
    
    /**
     * Constructor
     */
    public Child(){
        
    }
    
    /**
     * Print Method
     */
    @Override
    public void print(){
        
        System.out.println("Child");
    
    }
    
    /**
     * If you want to Overload the previous method...
     */
    public  void print(int i){
        
        System.out.println("Chlid + " + i);
        
    }
    
}
