 /*
  * To change this template file, choose Settings | Editor | File and Code Templates
  * and change the template in the editor.
  */

 package Java_HW.Question_11_02;

 /**
  * @author AHMED ABUWARDA.
  */
 public class Staff extends Employee {

     // Data field.
     private String title;

     /**
      * Construct a Staff object.
      *
      * @param name    Name.
      * @param address Address.
      * @param phone   Phone.
      * @param email   Email.
      * @param office  Office.
      * @param salary  Salary.
      * @param title   title.
      */
     public Staff(String name, String address, String phone, String email, int office, double salary, String title) {

         super(name, address, phone, email, office, salary);
         this.title = title;

     }

     /**
      * @return title.
      */
     public String getTitle() {
         return title;
     }

     /**
      * @param title Set new title.
      */
     public void setTitle(String title) {
         this.title = title;
     }

     /**
      * @return a string description of the class.
      */
     @Override
     public String toString() {
         return super.toString() + "\nTitle: " + title;
     }

 }