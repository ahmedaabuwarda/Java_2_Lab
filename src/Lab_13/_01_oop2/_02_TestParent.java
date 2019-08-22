/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_13._01_oop2;

/**
 * @author AHMED ABUWARDA.
 */
public class _02_TestParent {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        // Create new child object.
        _01_Child child = new _01_Child();

        // Print child class method.
        child.child1();

        // Print parent class method.
        child.parent1();

    }

}