/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*****************************************
*                Person                  *
*----------------------------------------*
* -name: String                          *
* -address: String                       *
* -phone: String                         *
* -email: String                         *
* +Person()                              *
* +Person(name: String, address: String, *
*  phone: String, email: String)         *
* +getName(): String                     *
* +getAddress(): String                  *
* +getPhone(): String                    *
* +getEmail(): String                    *
* +setName(name: String ): void          *
* +setAddress(address: String): void     *
* +setPhone(phone: String): void         *
* +setEmail(email: String): void         *
* +toString(): String                    *
*****************************************/

package Java_HW.Question_11_02;

/**
 *
 * @author AHMED ABUWARDA
 */
public class Person {

    private String name;
    private String address;
    private String phone;
    private String email;

    /**
     * Construct default Person object
     */
    public Person() {
        this("Unknown", "Unknown", "Unknown", "Unknown");
    }

    /**
     * Construct Person object with specified name, address, phone and email
     * @param name
     * @param address
     * @param phone
     * @param email 
     */
    public Person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set new name
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set new address
     * @param address 
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Set new phone number
     * @param phone 
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Set new email
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return a string description of the class
     */
    @Override
    public String toString() {
        return "\nName: " + name + "\nAddress: " + address
                + "\nPhone number: " + phone + "\nEmail address: " + email;
    }
}
