 /*
  * To change this template file, choose Settings | Editor | File and Code Templates
  * and change the template in the editor.
  */

 package Java_HW.Question_11_02;

 /**
  * @author AHMED ABUWARDA.
  */
 public class Faculty extends Employee {

     // Data Fields.
     private String officeHours;
     private String rank;

     /**
      * Construct a Faculty object with specified name, address, phone number,
      * email address, office, salary, office hours and rank
      *
      * @param name        Name.
      * @param address     Address.
      * @param phone       Phone.
      * @param email       Email.
      * @param office      Office.
      * @param salary      Salary.
      * @param officeHours Office hours.
      * @param rank        Rand.
      */
     Faculty(String name, String address, String phone, String email, int office, double salary,
             String officeHours, String rank) {

         super(name, address, phone, email, office, salary);
         this.officeHours = officeHours;
         this.rank = rank;

     }

     /**
      * @return officeHours.
      */
     public String getOfficeHours() {
         return officeHours;
     }

     /**
      * @param officeHours Set new officeHours.
      */
     public void setOfficeHours(String officeHours) {
         this.officeHours = officeHours;
     }

     /**
      * @return rank.
      */
     public String getRank() {
         return rank;
     }

     /**
      * Set new rank
      *
      * @param rank A string.
      */
     public void setRank(String rank) {
         this.rank = rank;
     }

     /**
      * @return a string description of the class.
      */
     @Override
     public String toString() {
         return super.toString() + "\nOffice hours: " + officeHours
                 + "\nRank: " + rank;
     }

 }