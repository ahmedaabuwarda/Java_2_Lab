/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_12;

/**
 * @author AHMED ABUWARDA.
 */
public class _03_PersonWithArrayList {

    // Values "data fields".
    String fName;
    String lName;
    int ID;

    // Default constructor.
    public _03_PersonWithArrayList() {

    }

    /**
     * Another constructor.
     *
     * @param fName First name.
     * @param lName Last name.
     * @param ID Id.
     */
    _03_PersonWithArrayList(String fName, String lName, int ID) {

        this.fName = fName;
        this.lName = lName;
        this.ID = ID;

    }

    /**
     * @return Full name.
     */
    String getFullName() {
        return this.fName + " " + this.lName;
    }

}