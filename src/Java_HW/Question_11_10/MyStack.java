 /*
  * To change this template file, choose Settings | Editor | File and Code Templates
  * and change the template in the editor.
  */

 package Java_HW.Question_11_10;

 /**
  * @author AHMED ABUWARDA.
  */
 public class MyStack extends java.util.ArrayList {

     // Data fields.
     private java.util.ArrayList<Object> list;

     // Construct a default MyStack object.
     MyStack() {
         list = new java.util.ArrayList<Object>();
     }

     /**
      * @param o Object "Add a new element to the top of this stack".
      */
     void push(Object o) {
         list.add(0, o);
     }

     /**
      * @return The top element in this stack without removing it.
      */
     public Object peek() {
         return list.get(0);
     }

     /**
      * @return An remove the top element in this stack.
      */
     public Object pop() {

         Object o = list.get(0);
         list.remove(0);
         return o;

     }

     /**
      * @return A string of all elements in MyStack.
      */
     @Override
     public String toString() {
         return "stack: " + list.toString();
     }

 }