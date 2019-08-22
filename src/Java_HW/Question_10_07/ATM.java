 /*
  * To change this template file, choose Settings | Editor | File and Code Templates
  * and change the template in the editor.
  */

 package Java_HW.Question_10_07;

 import java.util.Scanner;

 /**
  * @author AHMED ABUWARDA.
  */
 public class ATM {

     /**
      * @param args the command line here.
      */
     public static void main(String[] args) {
         // TODO code application logic here.

         // Create a Scanner
         Scanner input = new Scanner(System.in);

         // Create ten accounts in an array
         Account[] accounts = new Account[10];

         // Initialize accounts with balance
         initialBalance(accounts);

         // Once the system starts, it will not stop
         do {
             // Prompt user to enter an id
             System.out.print("Enter an id: ");
             int id = input.nextInt();

             if (isValidID(id, accounts)) {

                 int choice;

                 do {

                     // Get user choice
                     choice = displayMainMenu(input);

                     if (isTransaction(choice)) {
                         executeTransaction(choice, accounts, id, input);
                     }

                 } while (choice != 4); // If 4 exit main menu

             }

             // Once you exit, the system will prompt for an id again
         } while (true);

     }

     /**
      * Initialize accounts with balance of 100
      *
      * @param a An array.
      */
     private static void initialBalance(Account[] a) {

         int initialBalance = 100;

         for (int i = 0; i < a.length; i++) {
             a[i] = new Account(i, initialBalance);
         }

     }

     /**
      * @param choice An int number.
      * @return true if choice is a transaction
      */
     private static boolean isTransaction(int choice) {
         return choice > 0 && choice < 4;
     }

     /**
      * @param id int Id.
      * @param a  Array of accounts.
      * @return true or false.
      */
     private static boolean isValidID(int id, Account[] a) {

         // For each loop.
         for (Account account : a) {

             // If statement.
             if (id == account.getId()) {
                 return true;
             }

         }

         return false;

     }

     /**
      * @param input Input from user.
      * @return main menu.
      */
     private static int displayMainMenu(Scanner input) {

         System.out.print("\nMain menu\n1: check balance\n2: withdraw"
                 + "\n3: deposit\n4: exit\nEnter a choice: ");
         return input.nextInt();
     }

     /**
      * Execute a Transaction.
      *
      * @param c     An int number.
      * @param a     Array of Accounts.
      * @param id    An int id.
      * @param input Input from user.
      */
     private static void executeTransaction(int c, Account[] a, int id, Scanner input) {

         switch (c) {

             case 1: // Viewing the current balance
                 System.out.println("The balance is " + a[id].getBalance());
                 break;
             case 2: // Withdraw money
                 System.out.print("Enter an amount to withdraw: ");
                 a[id].withdraw(input.nextDouble());
                 break;
             case 3: // Deposit money
                 System.out.print("Enter an amount to deposit: ");
                 a[id].deposit(input.nextDouble());

         }

     }

 }