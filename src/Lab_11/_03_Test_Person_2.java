/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_11;

/**
 * @author AHMED ABUWARDA.
 */
public class _03_Test_Person_2 {

    /**
     * @param args the command line arguments.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        // Create person1 object from class Person_2.
        _03_Person_2 person1 = new _03_Person_2();

        // assign Data ID to person1 object.
        person1.setID(120110000);

        // print the results.
        System.out.println("ID: " + person1.getID());

        // print counter result.
        System.out.println("counter: " + _03_Person_2.getCounter());

    }

}