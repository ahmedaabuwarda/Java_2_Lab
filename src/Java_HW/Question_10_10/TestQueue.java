/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_HW.Question_10_10;

/**
 *
 * @author AHMED ABUWARDA
 */
public class TestQueue {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // Create a Queue object
        Queue queue = new Queue();

        // Adds 20 numbers from 1 to 20 into the queue
        for (int i = 1; i <= 20; i++) {
            queue.enqueue(i);
        }

        // Removes these numbers and displays them
        while (!queue.empty()) {
            System.out.print(queue.dequeue() + " ");
        }
        System.out.println();
    }

}
