/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_15.imp3;

/**
 *
 * @author AHMED ABUWARDA
 */
public interface Drawable {

    void draw();

    static int cupe(int i) {

        return i * i * i;

    }

    default void print() {

        System.out.println("print");

    }

}

class Rectangle implements Drawable {

    @Override
    public void draw() {

        System.out.println("drawing rectangle");

    }

}

class Testinterface3 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Drawable dr = new Rectangle();
        dr.draw();
        dr.print();
        System.out.println(Drawable.cupe(8));

        Rectangle rec = new Rectangle();
        rec.draw();
        rec.print();

    }

}
