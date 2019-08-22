 /*
  * To change this template file, choose Settings | Editor | File and Code Templates
  * and change the template in the editor.
  */

 package Java_HW.Question_11_02;

 /**
  * @author AHMED ABUWARDA.
  */
 public class Employee extends Person {

     // Data Fields.
     private int office;
     private double salary;
     private MyDate dateHired;

     /**
      * Construct Employee object.
      *
      * @param name    Name.
      * @param address Address.
      * @param phone   Phone.
      * @param email   Email.
      * @param office  Office.
      * @param salary  Salary.
      */
     Employee(String name, String address, String phone, String email, int office, double salary) {

         super(name, address, phone, email);
         this.office = office;
         this.salary = salary;
         this.dateHired = new MyDate();

     }

     /**
      * @return office.
      */
     public int getOffice() {
         return office;
     }

     /**
      * @return salary.
      */
     String getSalary() {
         return String.format("%.2f", salary);
     }

     /**
      * @return Date hired.
      */
     private String getDateHired() {
         return dateHired.getMonth() + "/" + dateHired.getDay()
                 + "/" + dateHired.getYear();
     }

     /**
      * @param office Set new office.
      */
     public void setOffice(int office) {
         this.office = office;
     }

     /**
      * @param salary Set new salary.
      */
     public void setSalary(double salary) {
         this.salary = salary;
     }

     // Set new dateHired.
     public void setDateHired() {
         dateHired = new MyDate();
     }

     /**
      * @return A string description of the class.
      */
     @Override
     public String toString() {
         return super.toString() + "\nOffice: " + office
                 + "\nSalary: $" + getSalary() + "\nDate hired: " + getDateHired();
     }

 }