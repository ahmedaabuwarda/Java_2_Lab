 /*
  * To change this template file, choose Settings | Editor | File and Code Templates
  * and change the template in the editor.
  */

 package Lab_15.imp6;

 /**
  * @author AHMED ABUWARDA.
  */
 abstract class Base {

     int x = 3;

     Base() {

         x += 2;
         System.out.println("x = " + x);
         x++;

     }

     abstract int calculate();

     /**
      * @param i An int number.
      * @return abstract method.
      */
     abstract int calculate(int i);

 }

 // SuperA class.
 class SuperA extends Base {

     int x = 1;

     SuperA() {

         System.out.println("x = " + calculate(2));

     }

     @Override
     int calculate() {
         return x;
     }

     /**
      * @param i An int number.
      * @return calculate() + i
      */
     @Override
     int calculate(int i) {
         return calculate() + i;
     }

 }

 // Sup class.
 class Sub extends SuperA {

     Sub() {
         x += 3;
     }

     @Override
     int calculate() {
         return x + 6;
     }

     /**
      * @param args the command line here.
      */
     public static void main(String[] args) {
         // TODO code application logic here.

         Sub sub = new Sub();
         System.out.println("x = " + sub.calculate());

     }

 }