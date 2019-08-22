/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**********************************************************
*                      Faculty                            *
*---------------------------------------------------------*
* -officeHours: int                                       *
* -rank: String                                           *
* +Faculty(name: String, address: String, phone: String,  *
*  email: String, office: int, salary: double,            *
*  officeHours: int, rank: String)     *
* +getOfficeHours(): int                                  *
* +setOfficeHours(officeHours: int): void                 *
* +getRank(): String                                      *
* +setRank(rank: String): void                            *
* +toString(): String                                     *
**********************************************************/

package Java_HW.Question_11_02;

/**
 *
 * @author AHMED ABUWARDA
 */
public class Faculty extends Employee {

    private String officeHours;
    private String rank;

    /**
     * Construct a Faculty object with specified name, address, phone number,
     * email address, office, salary, office hours and rank
     * 
     * @param name
     * @param address
     * @param phone
     * @param email
     * @param office
     * @param salary
     * @param officeHours
     * @param rank 
     */
    public Faculty(String name, String address, String phone, String email,
            int office, double salary, String officeHours, String rank) {
        
        super(name, address, phone, email, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
        
    }

    /**
     * @return officeHours
     */
    public String getOfficeHours() {
        return officeHours;
    }

    /**
     * Set new officeHours
     *
     * @param officeHours
     */
    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    /**
     * @return rank
     */
    public String getRank() {
        return rank;
    }

    /**
     * Set new rank
     *
     * @param rank
     */
    public void setRank(String rank) {
        this.rank = rank;
    }

    /**
     * @return a string description of the class
     */
    @Override
    public String toString() {
        return super.toString() + "\nOffice hours: " + officeHours
                + "\nRank: " + rank;
    }
}
