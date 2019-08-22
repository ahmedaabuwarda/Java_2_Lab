/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*************************************************
*                   Student                      *
*------------------------------------------------*
* -status: String                                *
* ---------------                                *
* +Student(name: String, address: String,        *
*  phone: String, email: String, status: String) *
* +getStatus(): String                           *
* +setStatus(status: String): void               *
* +toString(): String                            *
*************************************************/

package Java_HW.Question_11_02;

/**
 *
 * @author AHMED ABUWARDA
 */
public class Student extends Person {

    private int status;
    public final static int FRESHMAN = 1;
    public final static int SOPHOMORE = 3;
    public final static int JUNIOR = 2;
    public final static int SENIOR = 4;

    public Student(String name, String address, String phone, String email, int status) {
        
        super(name, address, phone, email);
        this.status = status;
        
    }

    /**
     * Set new status 
     * @param status 
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * @return status
     */
    public String getStatus() {
        
        switch (status) {
            case 1:
                return "freshman";
            case 2:
                return "sophomore";
            case 3:
                return "junior";
            case 4:
                return "senior";
            default:
                return "Unknown";
        }
    }

    /**
     * @return a string description of the class
     */
    @Override
    public String toString() {
        return super.toString() + "\nStatus: " + getStatus();
    }
}
