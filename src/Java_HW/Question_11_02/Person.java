 /*
  * To change this template file, choose Settings | Editor | File and Code Templates
  * and change the template in the editor.
  */

 package Java_HW.Question_11_02;

 /**
  * @author AHMED ABUWARDA.
  */
 public class Person {

     // Data fields.
     private String name;
     private String address;
     private String phone;
     private String email;

     // Construct default Person object.
     public Person() {

         this("Unknown", "Unknown", "Unknown", "Unknown");

     }

     /**
      * Construct Person object with specified name, address, phone and email.
      *
      * @param name    Name.
      * @param address Address.
      * @param phone   Phone.
      * @param email   Email.
      */
     Person(String name, String address, String phone, String email) {

         this.name = name;
         this.address = address;
         this.phone = phone;
         this.email = email;

     }

     /**
      * @return name.
      */
     public String getName() {
         return name;
     }

     /**
      * @return address.
      */
     public String getAddress() {
         return address;
     }

     /**
      * @return phone.
      */
     public String getPhone() {
         return phone;
     }

     /**
      * @return email.
      */
     public String getEmail() {
         return email;
     }

     /**
      * @param name Set new name.
      */
     public void setName(String name) {
         this.name = name;
     }

     /**
      * @param address Set new address.
      */
     public void setAddress(String address) {
         this.address = address;
     }

     /**
      * @param phone Set new phone number.
      */
     public void setPhone(String phone) {
         this.phone = phone;
     }

     /**
      * @param email Set new email.
      */
     public void setEmail(String email) {
         this.email = email;
     }

     /**
      * @return a string description of the class.
      */
     @Override
     public String toString() {
         return "\nName: " + name + "\nAddress: " + address
                 + "\nPhone number: " + phone + "\nEmail address: " + email;
     }

 }