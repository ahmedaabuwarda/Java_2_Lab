/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_11;

/**
 * @author AHMED ABUWARDA.
 */
public class _06_Person {

    /**
     * Data fields "variables".
     */
    private String fName;
    private String lName;
    private int age;
    private int ID;
    private static int counter = 0;

    // default constructor.
    _06_Person() {
        counter++;
    }

    /**
     * another constructor,
     *
     * @param fName First name.
     * @param lName Last name.
     * @param age   Age.
     * @param ID    Id.
     */
    _06_Person(String fName, String lName, int age, int ID) {

        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.ID = ID;
        counter++;

    }

    /**
     * @return First name.
     */
    String getfName() {
        return fName;
    }

    /**
     * @param fName First name.
     */
    void setfName(String fName) {
        this.fName = fName;
    }

    /**
     * @return Last name.
     */
    String getlName() {
        return lName;
    }

    /**
     * @param lName Last name.
     */
    void setlName(String lName) {
        this.lName = lName;
    }

    /**
     * @return age.
     */
    int getAge() {
        return age;
    }

    /**
     * @param age Age.
     */
    void setAge(int age) {
        this.age = age;
    }

    /**
     * @return ID.
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID ID.
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return Counter.
     */
    static int getCounter() {
        return counter;
    }

}