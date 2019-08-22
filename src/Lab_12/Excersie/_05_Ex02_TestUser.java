/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_12.Excersie;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AHMED ABUWARDA
 */
public class _05_Ex02_TestUser {

    // Create Scanner and make it static to make it accessible to all methods
    static Scanner input = new Scanner(System.in);

    // Create ArrayList and make it static to make it accessible to all methods
    // and to avoid any loss of data
    static ArrayList<_05_Ex02_User> users = new ArrayList<>();

    // Assigne 1 to state value, to run the program
    static int state = 1;

    /**
     *
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here

        // Try catch to avoid any errors
        try {

            // Run this method to Execute the program
            mainMenue();

        } catch (Exception ex) {

            // Print error message
            System.out.println(" Error!, Invalid Input!");

            // Re-execute the mainMenue() method to keep the program running
            // and to avoid any loss of data
            mainMenue();

        }
    }

    public static void mainMenue() {

        // While loop to keep the program running
        while (true) {

            System.out.print("\n Enter the state (0: To Exit): "
                    + "\n 1: Add new user"
                    + "\n 2: Get all users"
                    + "\n 3: Search for user \n"
                    + "\n >>> The state: ");

            /**
             * Take the input as char value and convert it to its numeric value
             * to avoid any errors
             */
            state = ((int) (input.next().charAt(0))) - 48;
            
            // If statment
            if (state == '0' || state == 0) {

                // Shut down the program
                System.out.println("\n ***** You have terminate the program *****\n");
                break;

            } else if (state == 1) {

                // Run this method to add new user
                addNewUser();

            } else if (state == 2) {

                // Run this method to get all users
                getAllUsers();

            } else if (state == 3) {

                // Run this method to search for user
                searchForUser();

            } else {

                // Print error message
                System.out.println("\n-----------------------------------"
                        + "\n Error!, Invalid input, Try again!"
                        + "\n-----------------------------------");

                // Re-execute the mainMenue() method to keep the program running
                // and to avoid any loss of data
                break;
            }
        }
    }

    public static void addNewUser() {

        System.out.print("--------------------------------------------\n"
                + " Please, Enter name and email:\n Name: ");
        String name = input.next();

        System.out.print(" Email: ");
        String email = input.next();
        if (email.contains("@") && email.contains(".")) {

            // Create new user object and add it to ArrayList
            users.add(new _05_Ex02_User((int) (Math.random() * 1000000), name, email));
            System.out.println("\n ***** User Created Successfully *****");

        } else {

            // Print error message
            System.out.println("\n-------------------------------------------------------------"
                    + "\n Error!, your name or email is not correct, Please try again"
                    + "\n-------------------------------------------------------------");

            // Re-execute the mainMenue() method to keep the program running
            // and to avoid any loss of data
            addNewUser();

        }

    }

    public static void getAllUsers() {

        System.out.println("\n--------------------------------------------");
        System.out.println(" Id\t\tName\t\tEmail");

        // Print all existing users
        for (int i = 0; i < users.size(); i++) {
            System.out.println(" " + users.get(i).getID() + "\t\t"
                    + users.get(i).getUserName() + "\t\t" + users.get(i).getEmail());
        }
        System.out.println("--------------------------------------------\n"
                + " There is: " + _05_Ex02_User.getCounter() + " Users"
                + "\n--------------------------------------------");

    }

    public static void searchForUser() {

        System.out.print("\n >>> Please, Enter name or part of name: ");
        String name = input.next();

        System.out.println("\n--------------------------------------------");
        System.out.println(" Id\t\tName\t\tEmail");

        int counter = 0;
        // For loop to Find any user
        for (int i = 0; i < users.size(); i++) {

            // If any user match the input
            if (users.get(i).getUserName().contains(name)) {
                System.out.println(" " + users.get(i).getID() + "\t\t"
                        + users.get(i).getUserName() + "\t\t" + users.get(i).getEmail());
                counter++;
            }
        }
        System.out.println("\n--------------------------------------------\n"
                + " Found: " + counter + " match"
                + "\n--------------------------------------------");

    }

}
