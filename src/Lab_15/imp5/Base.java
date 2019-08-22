/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_15.imp5;

/**
 *
 * @author AHMED ABUWARDA
 */
public abstract class Base {

    int z = 6;

    public Base() {

        z -= 2;
        System.out.println("z = " + method(3, 8));

    }

    abstract int method(int i);

    abstract int method(int i, int j);

}

class Sub extends Base {

    int z = 2;

    public Sub() {

        System.out.println("z = " + method(4));

    }

    @Override
    int method(int i) {
        return (z * i + super.z);
    }

    @Override
    int method(int i, int j) {          // j is a local variable
        return (method(i) + i + j);     // j = 0
    }

    public static void main(String[] args) {

        Sub s = new Sub();

    }
}
