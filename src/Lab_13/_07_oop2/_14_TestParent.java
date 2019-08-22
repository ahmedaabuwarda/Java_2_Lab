 /*
  * To change this template file, choose Settings | Editor | File and Code Templates
  * and change the template in the editor.
  */

 package Lab_13._07_oop2;

 /**
  * @author AHMED ABUWARDA.
  */
 public class _14_TestParent {
     /**
      * @param args the command line here.
      */
     public static void main(String[] args) {
         // TODO code application logic here.

         // Create New Parent Object.
         _13_Parent parent = new _13_Parent();

         // Create new Child Object.
         Child child = new Child();

         // Print method.
         parent.print();

         // Override Method.
         child.print();

     }

 }