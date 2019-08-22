 /*
  * To change this template file, choose Settings | Editor | File and Code Templates
  * and change the template in the editor.
  */

 package Java_HW.Question_11_14;

 import java.util.ArrayList;
 import java.util.Scanner;

 /**
  * @author AHMED ABUWARDA.
  */
 public class Union {

     /**
      * @param args the command line here.
      */
     public static void main(String[] args) {
         // TODO code application logic here.

         // Create two ArrayLists.
         ArrayList<Integer> list1 = new ArrayList<>();
         ArrayList<Integer> list2 = new ArrayList<>();

         // Prompt the user to enter two lists each with five integers.
         System.out.print("Enter five integers for list1: ");
         fill(list1);

         System.out.print("Enter five integers for list2: ");
         fill(list2);

         // Combined lists.
         ArrayList<Integer> list3 = union(list1, list2);

         // Display combined list.
         System.out.print("The combined list is: ");

         for (Integer integer : list3) {
             System.out.print(integer + " ");
         }

         System.out.println();

     }

     /**
      * @param list1 ArrayList1.
      * @param list2 ArrayList2.
      * @return The union of two array lists of integers.
      */
     private static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {

         ArrayList<Integer> list3 = list1;

         // for each loop.
         for (Integer integer : list2) {

             list3.add(integer);

         }

         return list3;

     }

     /**
      * @param list An ArrayList "Adds user input to a list".
      */
     private static void fill(ArrayList<Integer> list) {

         // Create a Scanner.
         Scanner input = new Scanner(System.in);

         for (int i = 0; i < 5; i++) {

             list.add(input.nextInt());

         }

     }

 }