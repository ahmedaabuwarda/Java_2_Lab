/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_12;

import java.util.ArrayList;

/**
 * @author AHMED ABUWARDA.
 */
public class _01_ArrayList {

    /**
     * @param args the command line arguments.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        ArrayList<String> names = new ArrayList<>();

        // Add items.
        names.add("ahmed");
        names.add("Ali");
        names.add("hana");

        System.out.println("Array: " + names);

        // Get items
        names.get(0);
        names.get(1);
        names.get(2);

        System.out.println("Array: " + names);

        // set items >> like replace
        names.set(1, "mohammed");

        System.out.println("Array after set: " + names);

        // ArrayList size
        System.out.println("Array size: " + names.size());

        // remove item 1 from ArrayList
        names.remove(1);

        System.out.println("Array after remove: " + names);

        // clear all the items in the Array List
        names.clear();

        System.out.println("Array after clear: " + names);

    }

}