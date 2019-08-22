/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_12.Excersie;

/**
 *
 * @author AHMED ABUWARDA
 */
public class _05_Ex02_User {

    /**
     * Data fields
     */
    private int ID;
    private String userName;
    private String email;
    private static int counter = 0;
    
    /**
     * Default constructor
     */
    _05_Ex02_User() {
        counter++;
    }

    /**
     * Another constructor
     *
     * @param ID
     * @param userName
     * @param email
     */
    _05_Ex02_User(int ID, String userName, String email) {

        this.ID = ID;
        this.userName = userName;
        this.email = email;
        counter++;

    }

    /**
     *
     * @return ID
     */
    public int getID() {
        return ID;
    }

    /**
     * Set ID
     *
     * @param ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     *
     * @return User Name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Set User Name
     *
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     *
     * @return Email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set Email
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * 
     * @return number of objects
     */
    public static int getCounter(){
        return counter;
    }

}
