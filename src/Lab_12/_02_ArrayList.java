/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_12;

import java.util.ArrayList;

/**
 * @author AHMED ABUWARDA.
 */
public class _02_ArrayList {

    /**
     * @param args the command line arguments.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        ArrayList<String> names = new ArrayList<>();

        // Add elements to ArrayList.
        names.add("Ahmed");
        names.add("Ali");
        names.add("Omar");

        // Loop Through an ArrayList to print the elements inside it "Using for each loop".
        for (String name : names) {
            System.out.println(name);
        }

        // Another method to print ArrayList elements "Using for loop".
        for (String i : names) {
            System.out.println(i);
        }

    }

}