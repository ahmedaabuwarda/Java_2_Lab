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
public abstract class Base1 {

    int y = 5;

    public Base1() {
        y -= 2;
        System.out.println("y = " + method(4, 7));
    }

    abstract int method(int i);

    abstract int method(int i, int j);

}

class Super extends Base1 {

    int y = 2;

    public Super() {

        System.out.println("y = " + method(4));

    }

    @Override
    int method(int i) {

        return (y * i + super.y);

    }

    @Override
    int method(int i, int j) {

        return (method(i) + i + j);

    }

}

class Sub1 extends Super {
    
    @Override
    int method (int i){
        return y * 2 + i;
        
    }
    
    public static void main(String[] args) {
    
        Sub sub = new Sub();
        
    }
    
}