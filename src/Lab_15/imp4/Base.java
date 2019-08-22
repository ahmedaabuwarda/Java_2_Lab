/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_15.imp4;

/**
 *
 * @author AHMED ABUWARDA
 */
public abstract class Base {

    int x = 2;

    public Base() {

        System.out.println("x = " + x);
        x++;

    }

    abstract int calculate();

    abstract int calculate(int i);

}

class MySuper extends Base {

    public MySuper() {

        System.out.println("x = " + calculate(2));

    }

    @Override
    int calculate() {

        return x;

    }

    @Override
    int calculate(int i) {

        return i * x;

    }

}

class Sub extends MySuper {
    
    @Override
    int calculate (){
        
        return x + 2;
    
    }
    
    /**
     * .
     * @param args 
     */
    public static void main(String[] args) {
        
        Sub sub = new Sub();
        System.out.println("x = " + sub.calculate());
        
    }
    
}
