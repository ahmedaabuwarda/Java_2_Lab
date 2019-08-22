/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_15.imp6;

/**
 *
 * @author AHMED ABUWARDA
 */
public abstract class Base {

    int x = 3;

    public Base() {
        x += 2;
        System.out.println("x = " + x);
        x++;
    }

    abstract int calculate();

    abstract int calculate(int i);

}

class SuperA extends Base {

    int x = 1;

    public SuperA() {

        System.out.println("x = " + calculate(2));

    }

    @Override
    int calculate() {
        return x;
    }

    @Override
    int calculate(int i) {
        return calculate() + i;
    }

}

class Sub extends SuperA {

    public Sub() {
        x += 3;
    }

    @Override
    int calculate() {
        return x + 6;
    }

    public static void main(String[] args) {

        Sub sub = new Sub();
        System.out.println("x = " + sub.calculate());

    }

}
