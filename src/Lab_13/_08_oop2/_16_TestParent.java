 /*
  * To change this template file, choose Settings | Editor | File and Code Templates
  * and change the template in the editor.
  */

 package Lab_13._08_oop2;

 /**
  * @author AHMED ABUWARDA.
  */
 public class _16_TestParent {

     /**
      * @param args the command line here.
      */
     public static void main(String[] args) {
         // TODO code application logic here.

         // Create new parent object from _15_Parent class.
         _15_Parent parent = new _15_Parent();

         // Create new child2 object from Child_2 class inside _15_Parent class.
         Child_2 child2 = new Child_2();

         // Create new child1 object from Child_1 class inside _15_Parent class.
         Child_1 child1 = new Child_1();

         // print method from parent object.
         parent.print();

         // Override print method from parent object.
         child1.print();

         // Override print method from parent object.
         child2.print();

         System.out.println("\n" + (parent instanceof _15_Parent));    // true
         System.out.println(child1 instanceof Child_1);                // true
         System.out.println(child2 instanceof Child_2);                // true

         System.out.println(child1 instanceof _15_Parent);             // true
         System.out.println(child2 instanceof _15_Parent);             // true

         System.out.println(parent instanceof Child_1);                // false
         System.out.println((parent instanceof Child_2) + "\n");       // false

         _15_Parent parent2 = new _15_Parent();

         _15_Parent parentChild1 = new Child_1();

         _15_Parent parentChild2 = new Child_2();

         parent.print();

         parentChild1.print();

         parentChild2.print();

         System.out.println("\n" + (parent2 instanceof _15_Parent));   // true
         System.out.println(parentChild1 instanceof _15_Parent);       // true
         System.out.println(parentChild2 instanceof _15_Parent);       // true

         System.out.println(parent2 instanceof Child_1);               // false
         System.out.println(parent2 instanceof Child_2);               // false

         System.out.println(parentChild1 instanceof Child_1);          // true
         System.out.println(parentChild1 instanceof Child_2);          // false

         System.out.println(parentChild2 instanceof Child_1);          // true
         System.out.println(parentChild2 instanceof Child_2);          // true

     }

 }