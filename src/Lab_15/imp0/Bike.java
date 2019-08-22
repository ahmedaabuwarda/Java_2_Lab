/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_15.imp0;

/**
 * @author AHMED ABUWARDA.
 */
abstract class Bike {

    // Constructor.
    Bike() {
        System.out.println("Bike is created");
    }

    abstract void run();

    void changeGear() {

        System.out.println("Gear changed");

    }

}

// Honda class.
class Honda extends Bike {

    @Override
    void run() {

        System.out.println("Running safely..");

    }

}

// TestAbstraction2 class.
class TestAbstraction2 {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        Bike b = new Honda();
        b.run();
        b.changeGear();

    }

}