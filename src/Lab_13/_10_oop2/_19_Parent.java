/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_13._10_oop2;

/**
 * @author AHMED ABUWARDA.
 */
public class _19_Parent {
    
    // Constructor.
    _19_Parent(){
        
        System.out.println("Parent");
        
    }
    
    // Another constructor.
    public _19_Parent(int n){
        
        System.out.println("Parent " + n);
        
    }
    
}

 /**
  * New Class.
  * 
  * @author AHMED ABUWARDA.
  */
class Child_1 extends _19_Parent{
    
    // Constructor.
    Child_1(){
        
        this(5);
        // super(8);        // Error
        System.out.println("child_1");
        
    }
    
    // Another constructor.
    private Child_1(int n){
        
        System.out.println("Child_1 " + n);
        
    }
    
}