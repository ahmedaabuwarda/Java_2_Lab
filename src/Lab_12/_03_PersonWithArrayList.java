/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_12;

/**
 *
 * @author AHMED ABUWARDA
 */
public class _03_PersonWithArrayList {
    
    /**
     * Values (data fields)
     */
    String fName;
    String lName;
    int ID;

    /**
     * default constructor
     */
    public _03_PersonWithArrayList() {
        
    }

    /**
     * another constructor
     * 
     * @param fName
     * @param lName
     * @param ID 
     */
    public _03_PersonWithArrayList(String fName, String lName, int ID) {
        
        this.fName = fName;
        this.lName = lName;
        this.ID = ID;
    
    }
    
    /**
     * 
     * @return Full name
     */
    public String getFullName(){
        return this.fName + " " + this.lName;
    } 
}
