 /*
  * To change this template file, choose Settings | Editor | File and Code Templates
  * and change the template in the editor.
  */

 package Java_HW.Question_10_07;

 import java.util.Date;

 /**
  * @author AHMED ABUWARDA.
  */
 public class Account {

     // Data fields.
     private int id;
     private double balance;
     private static double annualInterestRate;
     private final Date dateCreated;

     // Constructors.
     Account() {

         id = 0;
         balance = 0;
         annualInterestRate = 0;
         dateCreated = new Date();

     }

     // Creates an account with the specified id and initial balance.

     /**
      * @param newId      An int Id.
      * @param newBalance Double balance.
      */
     Account(int newId, double newBalance) {

         id = newId;
         balance = newBalance;
         dateCreated = new Date();

     }

     /**
      * @param newId Set id.
      */
     public void setId(int newId) {
         id = newId;
     }

     /**
      * @param newBalance Set balance.
      */
     public void setBalance(double newBalance) {
         balance = newBalance;
     }

     /**
      * @param newAnnualInterestRate Set annualInterestRate.
      */
     public void setAnnualInterestRate(double newAnnualInterestRate) {
         annualInterestRate = newAnnualInterestRate;
     }

     /**
      * @return id.
      */
     public int getId() {
         return id;
     }

     /**
      * @return balance.
      */
     double getBalance() {
         return balance;
     }

     /**
      * @return annualInterestRate.
      */
     public double getAnnualInterestRate() {
         return annualInterestRate;
     }

     /**
      * @return dateCreated.
      */
     public String getDateCreated() {
         return dateCreated.toString();
     }

     /**
      * @return monthly interest rate.
      */
     private double getMonthlyInterestRate() {
         return annualInterestRate / 12;
     }

     /**
      * @return monthly interest.
      */
     public double getMonthlyInterest() {
         return balance * (getMonthlyInterestRate() / 100);
     }

     /**
      * @param amount Decrease balance by amount.
      */
     void withdraw(double amount) {
         balance -= amount;
     }

     /**
      * @param amount Increase balance by amount.
      */
     void deposit(double amount) {
         balance += amount;
     }

 }