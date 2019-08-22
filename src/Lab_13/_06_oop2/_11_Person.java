/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_13._06_oop2;

/**
 *
 * @author AHMED ABUWARDA
 */
public class _11_Person {

    int ID;
    String Name;

    public _11_Person() {

        this(0, "Unknown");

    }

    public _11_Person(int ID, String Name) {

        this.ID = ID;
        this.Name = Name;

    }

    public void setID(int ID) {

        this.ID = ID;

    }

    public int getID() {

        return ID;

    }

    public void setName(String Name) {

        this.Name = Name;

    }

    public String getName() {

        return Name;

    }
}

class Student extends _11_Person {

    int stdNumber;

    public Student() {

        this(0, "Unknown", 0);

    }

    public Student(int ID, String Name, int stdNumber) {

        super(ID, Name);
        this.stdNumber = stdNumber;

    }

    public void setStdNumber(int stdNumber) {

        this.stdNumber = stdNumber;

    }

    public int getStdNumber() {

        return stdNumber;

    }

    public String getNameWithNumber() {

        return super.getName() + " " + this.getStdNumber();

    }

}

class Teacher extends _11_Person {

    int salary;

    public Teacher() {
        this(0, "Unknown", 0);
    }

    public Teacher(int ID, String Name, int salary) {

        super(ID, Name);
        this.salary = salary;

    }
    
    public void setSalary(int salary){
        
        this.salary = salary;
        
    }
    
    
    public int getSalary(){
        
        return salary;
        
    }
    
    public void setName(String Name){
        
        super.Name = Name;
        
    }

}
