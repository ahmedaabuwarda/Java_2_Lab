 /*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_15.imp4;

/**
 * @author AHMED ABUWARDA.
 */
public abstract class Shape {
    
    protected abstract double getArea(double length);

    protected abstract double getPerimeter(double length);
    
}

abstract class Square extends Shape {

    /**
     *
     * @param side A double number.
     * @return side * side.
     */
    @Override
    public double getArea(double side) {
        
        return side * side;
        
    }
    
    public abstract double getPerimeter();
    
}

class Testprogram {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.
        
        //Square s = new Square();
        //System.out.println(s.getArea(5));
        
    }
    
}