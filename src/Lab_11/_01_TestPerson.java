/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_11;

/**
 * @author AHMED ABUWARDA.
 */
public class _01_TestPerson {

    /**
     * @param args the command line arguments.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        // Create object person1 using the first constructor (new Person()).
        _01_Person person1 = new _01_Person();

        // Print the values of person1 object.
        System.out.println("\n First name: " + person1.fName);
        System.out.println(" Last name: " + person1.lName);
        System.out.println(" Age: " + person1.age);
        System.out.println(" ID: " + person1.ID);


        // Create object person2 using the second constructor (Person(fName,lName, age, ID))
        // and assign values to it.
        _01_Person person2 = new _01_Person("Emad", "Mostafa", 21, 120130000);


        // Print the values of person2 object.
        System.out.println("\n First name: " + person2.fName);
        System.out.println(" Last name: " + person2.lName);
        System.out.println(" Age: " + person2.age);
        System.out.println(" ID: " + person2.ID);
        System.out.println(" Full name: " + person2.getFullName());


        // Create object person3 using the second constructor (Person(fName,lName, age, ID)).
        _01_Person person3 = new _01_Person();

        // Assign values to person3 object.
        person3.fName = "Hamza";
        person3.lName = "Emad";
        person3.age = 21;
        person3.ID = 120130001;


        // Print the values of person3 object.
        System.out.println("\n First name: " + person3.fName);
        System.out.println(" Last name: " + person3.lName);
        System.out.println(" age: " + person3.age);
        System.out.println(" ID: " + person3.ID);
        System.out.println(" Full name: " + person3.getFullName());

    }

}