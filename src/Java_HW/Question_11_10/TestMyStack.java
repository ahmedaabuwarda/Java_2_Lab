/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_HW.Question_11_10;

import java.util.Scanner;

/**
 *
 * @author AHMED ABUWARDA
 */
public class TestMyStack {

    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Create a MyStack
        MyStack stack = new MyStack();

        // Prompt the user to enter five strings
        System.out.print("Enter five strings: ");
        for (int i = 0; i < 5; i++) {
            stack.push(input.next());
        }

        // Display in reverse order
        System.out.println("Stack: " + stack.toString());
        
    }

}
