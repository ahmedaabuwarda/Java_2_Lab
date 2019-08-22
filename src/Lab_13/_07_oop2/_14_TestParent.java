/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_13._07_oop2;

/**
 *
 * @author AHMED ABUWARDA
 */
public class _14_TestParent {
    
    public static void main(String[] args) {
        
        /**
         * Create New Parent Object
         */
        _13_Parent parent = new _13_Parent();
        
        /**
         * Create new Child Object
         */
        Child  child = new Child();
        
        /**
         * Print Method
         */
        parent.print();
        
        /**
         * Override Method
         */
        child.print();
        
    }
    
}
