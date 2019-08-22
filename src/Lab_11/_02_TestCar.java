/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_11;

/**
 * @author AHMED ABUWARDA.
 */
public class _02_TestCar {

    /**
     * @param args the command line arguments.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        // Create object car1 using the first constructor (new Car()).
        _02_Car car1 = new _02_Car();

        // Print the values of car1 object.
        System.out.println(car1.toString());

        /*
         * Create object car2 using the second constructor (new Car(model,
         * color, capacity, maxSpeed, manufacturingYear ))
         */
        _02_Car car2 = new _02_Car();

        // Assign values to car2 object.
        car2.model = "I30";
        car2.color = "silver";
        car2.capacity = 4;
        car2.maxSpeed = 240;
        car2.manufacturingYear = 2010;

        // Print the values of car2 object.
        System.out.println("\n" + car2.toString());


         // Create object car3 using the second constructor (new Car(model, color, capacity,
         // maxSpeed, manufacturingYear )) and assign values to it.
        _02_Car car3 = new _02_Car("Mercedes 250", "Red", 4,
                260, 2000);

        // Print the values of car3 object.
        System.out.println("\n" + car3.toString());

        // System.out.println(car3.toString());

    }

}