 /*
  * To change this template file, choose Settings | Editor | File and Code Templates
  * and change the template in the editor.
  */

 package Java_HW.Question_11_02;

 /**
  * @author AHMED ABUWARDA.
  */
 public class Student extends Person {

     // Data Field.
     private int status;
     final static int FRESHMAN = 1;
     public final static int SOPHOMORE = 3;
     public final static int JUNIOR = 2;
     public final static int SENIOR = 4;

     Student(String name, String address, String phone, String email, int status) {

         super(name, address, phone, email);
         this.status = status;

     }

     /**
      * @param status Set new status.
      */
     public void setStatus(int status) {
         this.status = status;
     }

     /**
      * @return status.
      */
     private String getStatus() {

         switch (status) {
             case 1:
                 return "freshman";
             case 2:
                 return "sophomore";
             case 3:
                 return "junior";
             case 4:
                 return "senior";
             default:
                 return "Unknown";
         }

     }

     /**
      * @return a string description of the class.
      */
     @Override
     public String toString() {
         return super.toString() + "\nStatus: " + getStatus();
     }

 }