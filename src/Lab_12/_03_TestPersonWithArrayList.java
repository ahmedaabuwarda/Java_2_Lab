/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_12;

import java.util.ArrayList;

/**
 * @author AHMED ABUWARDA.
 */
public class _03_TestPersonWithArrayList {

    /**
     * @param args the command line arguments.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        // Crate ArrayList with Person class.
        ArrayList<_03_PersonWithArrayList> person = new ArrayList<>();

        // Create person1 object and add data to it.
        _03_PersonWithArrayList person1 = new _03_PersonWithArrayList("Ahmed", "Abuwarda", 55);

        // Create person2 object and add data to it.
        _03_PersonWithArrayList person2 = new _03_PersonWithArrayList("Safaa", "Abuwarda", 56);

        // Add person1 object to ArrayList.
        person.add(person1);

        // Add person2 object yo ArrayList.
        person.add(person2);

        /*
         * Another way...
         *
         * person.add(new _03_PersonWithArrayList("Ahmed","Abuwarda",12));
         * person.add(new _03_PersonWithArrayList("safaa","buwarda",13));
         */

        // Print person1 data which exists in ArrayList.
        System.out.println(" First Name: " + person.get(0).fName);
        System.out.println(" Last Name: " + person.get(0).lName);
        System.out.println(" ID: " + person.get(0).ID);
        System.out.println(" Full Name: " + person.get(0).getFullName());

        // print person2 data which exists in ArrayList.
        System.out.println("\n First Name: " + person.get(1).fName);
        System.out.println(" Last Name: " + person.get(1).lName);
        System.out.println(" ID: " + person.get(1).ID);
        System.out.println(" Full Name: " + person.get(1).getFullName());

        // Another method to print full name "Usnig for loop".
        for (_03_PersonWithArrayList perso : person) {
            System.out.println(perso.getFullName());
        }

    }

}
