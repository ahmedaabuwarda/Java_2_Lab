/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_15.imp0;

/**
 * @author AHMED ABUWARDA.
 */
abstract class Bank {

    abstract int getRateOfInterest();

}

// SBI class.
class SBI extends Bank {

    /**
     * @return 7.
     */
    @Override
    int getRateOfInterest() {

        return 7;

    }

}

// PNP class.
class PNB extends Bank {

    /**
     * @return 8.
     */
    @Override
    int getRateOfInterest() {

        return 8;

    }

}

// TestBank class.
class TestBank {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        Bank b;
        b = new SBI();
        System.out.println("Rate of Interest is: " + b.getRateOfInterest() + "%");
        b = new PNB();
        System.out.println("Rate of Interest is: " + b.getRateOfInterest() + "%");

    }

}