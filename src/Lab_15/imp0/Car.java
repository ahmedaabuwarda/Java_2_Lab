/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_15.imp0;

/**
 * @author AHMED ABUWARDA.
 */
public abstract class Car {

    // Abstract method.
    abstract void run();

}

// BMW class.
class BMW extends Car {

    // Overridden run method.
    @Override
    void run() {

        System.out.println("running");

    }

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        // Create new object.
        Car car1 = new BMW();
        // Run this method.
        car1.run();

    }

}