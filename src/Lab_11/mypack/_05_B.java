/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_11.mypack;

import Lab_11.pack._05_A;

/**
 * @author AHMED ABUWARDA.
 */
public class _05_B {

    /**
     * @param args the command line arguments.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        // Create obj object from A class.
        _05_A obj = new _05_A();

        // obj.msg();       // Without public gives you Compilation Error.

        // with public.
        obj.msg();

    }

}