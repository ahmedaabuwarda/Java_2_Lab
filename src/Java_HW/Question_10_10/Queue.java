 /*
  * To change this template file, choose Settings | Editor | File and Code Templates
  * and change the template in the editor.
  */

 package Java_HW.Question_10_10;

 /**
  * @author AHMED ABUWARDA.
  */
 public class Queue {

     /*******************
      *      Queue       *
      *------------------*
      * -elements: int[] *
      * -size: int       *
      * Queue()          *
      * enqueue(v: int)  *
      * dequeue(): int   *
      * empty(): boolean *
      * getSize(): int   *
      *******************/

     // Data fields.
     private int[] elements;
     private int size;
     private static final int DEFAULT_CAPACITY = 8;

     // Construct a Queue object with default capacity.
     Queue() {
         elements = new int[DEFAULT_CAPACITY];
     }

     /**
      * Adds v into the queue.
      *
      * @param v An int number.
      */
     void enqueue(int v) {

         if (size >= elements.length) {

             int[] temp = new int[elements.length * 2];
             System.arraycopy(elements, 0, temp, 0, elements.length);
             elements = temp;

         }

         elements[size++] = v;

     }

     /**
      * Removes and @return the element from the queue.
      *
      * @return v.
      */
     int dequeue() {

         int v = elements[0];
         int[] temp = new int[elements.length];
         System.arraycopy(elements, 1, temp, 0, size);
         elements = temp;
         size--;
         return v;

     }

     /**
      * @return true if queue is empty.
      */
     boolean empty() {
         return size == 0;
     }

     /**
      * @return size.
      */
     public int getSize() {
         return size;
     }

 }