/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_11;

/**
 * @author AHMED ABUWARDA.
 */
public class _03_Person_2 {

    // Variables.
    private String fName;
    private String lNamel;
    private int age;
    private int ID;
    private static int counter = 0;

    // Default Constructor.
    _03_Person_2() {
        counter++;
    }

    /**
     * Another Constructor
     *
     * @param fName  First name.
     * @param lNamel Last name.
     * @param age    Age.
     * @param ID     Id.
     */
    public _03_Person_2(String fName, String lNamel, int age, int ID) {

        this.fName = fName;
        this.lNamel = lNamel;
        this.age = age;
        this.ID = ID;
        counter++;

    }

    /**
     * @return First name.
     */
    public String getfName() {
        return fName;
    }

    /**
     * @param fName First name.
     */
    public void setfName(String fName) {
        this.fName = fName;
    }

    /**
     * @return Last name.
     */
    public String getlNamel() {
        return lNamel;
    }

    /**
     * @param lNamel Last name.
     */
    public void setlNamel(String lNamel) {
        this.lNamel = lNamel;
    }

    /**
     * @return Age.
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age Age.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return Id.
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID Id.
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

    /**
     * @param counter Counter.
     */
    public static void setCounter(int counter) {
        _03_Person_2.counter = counter;
    }

}