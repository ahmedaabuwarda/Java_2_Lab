/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_11;

/**
 * @author AHMED ABUWARDA.
 */
public class _02_Car {

    // Variables "data fields".
    String model;
    String color;
    int capacity; // int capacity = 4; also works.
    int maxSpeed;
    int manufacturingYear;

    // Default constructor.
    _02_Car() {

    }

    /**
     * Another constructor.
     *
     * @param carModel             Car model.
     * @param carColor             Car color.
     * @param carMaxSpeed          Car max speed.
     * @param carManufacturingYear Car Manufacturing year.
     */
    _02_Car(String carModel, String carColor, int carCapacity, int carMaxSpeed, int carManufacturingYear) {

        // Assigne values.
        this.model = carModel;
        this.color = carColor;
        this.capacity = carCapacity;
        this.maxSpeed = carMaxSpeed;
        this.manufacturingYear = carManufacturingYear;

    }

    /**
     * @return _02_Car details as string values.
     */
    public String toString() {
        return "\n Model: " + model + "\n Color: " + color + "\n Capacity: " + capacity
                + "\n Max Speed: " + maxSpeed + "\n Manufacturing Year: " + manufacturingYear;
    }

    /*
     * This works too..
     *
     * public String toString() {
     *    return String.format("%-20s%s\n%-20s%s\n%-20s%s\n%-20s%s\n%-20s%s",
     *            "\n Model:", model,
     *            " Color:", color,
     *            " Capacity:", capacity,
     *            " Maximum Speed:", maxSpeed,
     *            " Manufacturing Year:", manufacturingYear);
     * }
     */

}