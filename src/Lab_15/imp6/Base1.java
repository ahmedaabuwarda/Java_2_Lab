 /*
  * To change this template file, choose Settings | Editor | File and Code Templates
  * and change the template in the editor.
  */

 package Lab_15.imp6;

 /**
  * @author AHMED ABUWARDA.
  */
 abstract class Base1 {

     int y = 5;

     Base1() {

         y -= 2;
         System.out.println("y = " + method(4, 7));

     }

     /**
      * @param i An int number.
      * @return Abstract method.
      */
     abstract int method(int i);

     /**
      * @param i An int number.
      * @param j An int number.
      * @return Abstract method.
      */
     abstract int method(int i, int j);

 }

 // Super class.
 class Super extends Base1 {

     int y = 2;

     Super() {

         System.out.println("y = " + method(4));

     }

     /**
      * @param i An int number.
      * @return (y * i + super.y).
      */
     @Override
     int method(int i) {

         return (y * i + super.y);

     }

     /**
      * @param i An int number.
      * @param j An int number.
      * @return (method ( i) + i + j).
      */
     @Override
     int method(int i, int j) {

         return (method(i) + i + j);

     }

 }

 // Sup1 class.
 class Sub1 extends Super {
     /**
      * @param i An int number.
      * @return y * 2 + i.
      */
     @Override
     int method(int i) {

         return y * 2 + i;

     }

     /**
      * @param args the command line here.
      */
     public static void main(String[] args) {
         // TODO code application logic here.

         Sub sub = new Sub();

     }

 }