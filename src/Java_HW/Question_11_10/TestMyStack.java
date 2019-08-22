 /*
  * To change this template file, choose Settings | Editor | File and Code Templates
  * and change the template in the editor.
  */

 package Java_HW.Question_11_10;

 import java.util.Scanner;

 /**
  * @author AHMED ABUWARDA.
  */
 public class TestMyStack {

     /**
      * @param args the command line here.
      */
     public static void main(String[] args) {
         // TODO code application logic here.

         // Create a Scanner.
         Scanner input = new Scanner(System.in);

         // Create a MyStack.
         MyStack stack = new MyStack();

         // Prompt the user to enter five strings.
         System.out.print("Enter five strings: ");

         for (int i = 0; i < 5; i++) {
             stack.push(input.next());
         }

         // Display in reverse order.
         System.out.println("Stack: " + stack.toString());

     }

 }