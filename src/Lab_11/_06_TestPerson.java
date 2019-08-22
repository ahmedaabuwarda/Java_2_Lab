/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_11;

/**
 * @author AHMED ABUWARDA.
 */
public class _06_TestPerson {

    /**
     * @param args the command line arguments.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        // Create person1 object from _06_Person class.
        _06_Person person1 = new _06_Person();

        // Assign data to the object.
        person1.setfName("Ahmed");
        person1.setlName("Abuwarda");
        person1.setAge(20);
        person1.setID(120004444);

        // Print the data.
        System.out.println("First Name: " + person1.getfName());
        System.out.println("Last Name: " + person1.getlName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("ID: " + person1.getID());
        System.out.println("counter: " + _06_Person.getCounter());

    }

}