 /*
  * To change this template file, choose Settings | Editor | File and Code Templates
  * and change the template in the editor.
  */

 package Lab_13._06_oop2;

 /**
  * @author AHMED ABUWARDA.
  */
 public class _12_TestPerson {

     /**
      * @param args the command line here.
      */
     public static void main(String[] args) {
         // TODO code application logic here.

         Student student = new Student(120160010, "Ahmed", 120165256);
         Teacher teacher = new Teacher(120120011, "Ali", 1300);

         System.out.println(student.getName());
         System.out.println(student.getID());
         System.out.println(student.getStdNumber());
         System.out.println(student.getNameWithNumber());

         System.out.println(teacher.getName());
         System.out.println(teacher.getID());
         System.out.println(teacher.getSalary());

     }

 }