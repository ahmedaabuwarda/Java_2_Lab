/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**********************************************************************
*                                Staff                                *
*---------------------------------------------------------------------*
* -title: String                                                      *
* +Staff(name: String, address: String, phone: String, email: String, *
*  office: int, salary: double, dateHired: MyDate, title: String)     *
* +getTitle(): String                                                 *
* +setTitle(title: String): void                                      *
* +toString(): String                                                 *
**********************************************************************/

package Java_HW.Question_11_02;

/**
 *
 * @author AHMED ABUWARDA
 */
public class Staff extends Employee {

    private String title;

    /**
     * Construct a Staff object
     * @param name
     * @param address
     * @param phone
     * @param email
     * @param office
     * @param salary
     * @param title 
     */
    public Staff(String name, String address, String phone, String email, int office, double salary, String title) {
        super(name, address, phone, email, office, salary);
        this.title = title;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set new title
     * @param title 
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return a string description of the class
     */
    @Override
    public String toString() {
        return super.toString() + "\nTitle: " + title;
    }
}
