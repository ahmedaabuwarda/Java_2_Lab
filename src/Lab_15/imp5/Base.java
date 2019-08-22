 /*
  * To change this template file, choose Settings | Editor | File and Code Templates
  * and change the template in the editor.
  */

 package Lab_15.imp5;

 /**
  * @author AHMED ABUWARDA.
  */
 abstract class Base {

     int z = 6;

     Base() {

         z -= 2;
         System.out.println("z = " + method(3, 8));

     }

     /**
      *
      * @param i An int number.
      * @return Abstract method.
      */
     abstract int method(int i);

     /**
      *
      * @param i An int number.
      * @param j An int number.
      * @return Abstract method.
      */
     abstract int method(int i, int j);

 }

 class Sub extends Base {

     int z = 2;

     private Sub() {

         System.out.println("z = " + method(4));

     }

     /**
      * @param i An int number.
      * @return (z * i + super.z)
      */
     @Override
     int method(int i) {
         return (z * i + super.z);
     }

     /**
      * @param i An int number.
      * @param j An int number.
      * @return (method ( i) + i + j).
      */
     @Override
     int method(int i, int j) {          // j is a local variable
         return (method(i) + i + j);     // j = 0
     }

     /**
      * @param args the command line here.
      */
     public static void main(String[] args) {
         // TODO code application logic here.

         Sub s = new Sub();

     }
 }