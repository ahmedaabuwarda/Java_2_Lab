/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*****************************
*           MyStack          *
*----------------------------*
* -list: ArrayList<Object>   *
* +MyStack()                 *
* +peek(): Object            *
* +pop(): Object             *
* +push(o: Object): void     *
*****************************/

package Java_HW.Question_11_10;

/**
 *
 * @author AHMED ABUWARDA
 */
public class MyStack extends java.util.ArrayList {
    
    // Data fields
    private java.util.ArrayList<Object> list;

    /**
     * Construct a default MyStack object
     */
    public MyStack() {
        list = new java.util.ArrayList<Object>();
    }

    /**
     * Add a new element to the top of this stack
     * @param o 
     */
    public void push(Object o) {
        list.add(0, o);
    }

    /**
     * @return the top element in this stack without removing it
     */
    public Object peek() {
        return list.get(0);
    }

    /**
     * @return an remove the top element in this stack
     */
    public Object pop() {
        Object o = list.get(0);
        list.remove(0);
        return o;
    }

    /**
     * @return a string of all elements in MyStack
     */
    @Override
    public String toString() {
        return "stack: " + list.toString();
    }
}
