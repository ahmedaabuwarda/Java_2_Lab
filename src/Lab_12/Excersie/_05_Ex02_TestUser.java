/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_12.Excersie;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author AHMED ABUWARDA.
 */
public class _05_Ex02_TestUser {

    // Create Scanner and make it static to make it accessible to all methods.
    private static Scanner input = new Scanner(System.in);

    // Create ArrayList and make it static to make it accessible to all methods
    // and to avoid any loss of data.
    private static ArrayList<_05_Ex02_User> users = new ArrayList<>();

    // Assigne 1 to state value, to run the program.
    private static int state = 1;

    /**
     * @param args the command line arguments.
     * @throws java.lang.Exception Any exception.
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here.

        // Try catch to avoid any errors.
        try {

            // Run this method to Execute the program.
            mainMenu();

        } catch (Exception ex) {

            // Print error message.
            System.out.println(" Error!, Invalid Input!");

            // Re-execute the mainMenue() method to keep the program running
            // and to avoid any loss of data.
            mainMenu();

        }
    }

    private static void mainMenu() {

        // While loop to keep the program running.
        while (true) {

            System.out.print("\n Enter the state (0: To Exit): "
                    + "\n 1: Add new user"
                    + "\n 2: Get all users"
                    + "\n 3: Search for user \n"
                    + "\n >>> The state: ");

            // Take the input as char value and convert it to its numeric value to avoid any errors.
            state = ((int) (input.next().charAt(0))) - 48;

            // If statment.
            if (state == '0' || state == 0) {

                // Shut down the program.
                System.out.println("\n ***** You have terminate the program *****\n");
                break;

            } else if (state == 1) {

                // Run this method to add new user.
                addNewUser();

            } else if (state == 2) {

                // Run this method to get all users.
                getAllUsers();

            } else if (state == 3) {

                // Run this method to search for user.
                searchForUser();

            } else {

                // Print error message.
                System.out.println("\n-----------------------------------"
                        + "\n Error!, Invalid input, Try again!"
                        + "\n-----------------------------------");

                // Re-execute the mainMenue() method to keep the program running
                // and to avoid any loss of data.
                break;

            }

        }

    }

    // This method to add new user.
    private static void addNewUser() {

        System.out.print("--------------------------------------------\n"
                + " Please, Enter name and email:\n Name: ");
        String name = input.next();

        System.out.print(" Email: ");
        String email = input.next();

        // If statement.
        if (email.contains("@") && email.contains(".")) {

            // Create new user object and add it to ArrayList.
            users.add(new _05_Ex02_User((int) (Math.random() * 1000000), name, email));
            System.out.println("\n ***** User Created Successfully *****");

        } else {

            // Print error message.
            System.out.println("\n-------------------------------------------------------------"
                    + "\n Error!, your name or email is not correct, Please try again"
                    + "\n-------------------------------------------------------------");

            // Re-execute the mainMenue() method to keep the program running
            // and to avoid any loss of data.
            addNewUser();

        }

    }

    // This method to get all users.
    private static void getAllUsers() {

        System.out.println("\n--------------------------------------------");
        System.out.println(" Id\t\tName\t\tEmail");

        // Print all existing users "Using for each".
        for (_05_Ex02_User user : users) {
            System.out.println(" " + user.getID() + "\t\t"
                    + user.getUserName() + "\t\t" + user.getEmail());
        }

        System.out.println("--------------------------------------------\n"
                + " There is: " + _05_Ex02_User.getCounter() + " Users"
                + "\n--------------------------------------------");

    }

    // This method to search for any user.
    private static void searchForUser() {

        System.out.print("\n >>> Please, Enter name or part of name: ");
        String name = input.next();

        System.out.println("\n--------------------------------------------");
        System.out.println(" Id\t\tName\t\tEmail");

        int counter = 0;

        // For loop to Find any user "Using for each".
        for (_05_Ex02_User user : users) {

            // If any user match the input.
            if (user.getUserName().contains(name)) {
                System.out.println(" " + user.getID() + "\t\t"
                        + user.getUserName() + "\t\t" + user.getEmail());
                counter++;
            }

        }

        System.out.println("\n--------------------------------------------\n"
                + " Found: " + counter + " match"
                + "\n--------------------------------------------");

    }

}