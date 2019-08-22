/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_12.Excersie;

/**
 * @author AHMED ABUWARDA.
 */
public class _05_Ex02_User {

    // Data fields.
    private int ID;
    private String userName;
    private String email;
    private static int counter = 0;

    // Default constructor.
    _05_Ex02_User() {
        counter++;
    }

    /**
     * Another constructor.
     *
     * @param ID       Id.
     * @param userName User name.
     * @param email    Email.
     */
    _05_Ex02_User(int ID, String userName, String email) {

        this.ID = ID;
        this.userName = userName;
        this.email = email;
        counter++;

    }

    /**
     * @return Id.
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID Set id.
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return User name.
     */
    String getUserName() {
        return userName;
    }

    /**
     * @param userName Set user name.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return Email.
     */
    String getEmail() {
        return email;
    }

    /**
     * @param email Set email.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return Number of objects.
     */
    static int getCounter() {
        return counter;
    }

}