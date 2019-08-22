/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_13._06_oop2;

/**
 * @author AHMED ABUWARDA.
 */
public class _11_Person {

    private int ID;
    String Name;

    // Constructor.
    public _11_Person() {
        this(0, "Unknown");
    }

    /**
     * Another constructor.
     *
     * @param ID   Id.
     * @param Name Name.
     */
    _11_Person(int ID, String Name) {

        this.ID = ID;
        this.Name = Name;

    }

    /**
     * @param ID Set Id.
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return Id.
     */
    public int getID() {
        return ID;
    }

    /**
     * @param Name Set name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return Name.
     */
    public String getName() {
        return Name;
    }

}

// Student Class.
class Student extends _11_Person {

    private int stdNumber;

    // Constructor.
    public Student() {
        this(0, "Unknown", 0);
    }

    /**
     * Another constructor.
     *
     * @param ID        Id.
     * @param Name      Name.
     * @param stdNumber Std number.
     */
    Student(int ID, String Name, int stdNumber) {

        super(ID, Name);
        this.stdNumber = stdNumber;

    }

    /**
     * @param stdNumber Student number.
     */
    public void setStdNumber(int stdNumber) {
        this.stdNumber = stdNumber;
    }

    /**
     * @return Student number.
     */
    int getStdNumber() {
        return stdNumber;
    }

    /**
     * @return Name with number.
     */
    String getNameWithNumber() {
        return super.getName() + " " + this.getStdNumber();
    }

}

// Class Teacher.
class Teacher extends _11_Person {

    private int salary;

    // Constructor.
    public Teacher() {
        this(0, "Unknown", 0);
    }

    /**
     * @param ID     Id.
     * @param Name   Name.
     * @param salary Salary.
     */
    Teacher(int ID, String Name, int salary) {

        super(ID, Name);
        this.salary = salary;

    }

    /**
     * @param salary Set salary.
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * @return Salary.
     */
    int getSalary() {
        return salary;
    }

    /**
     * @param Name Set name.
     */
    public void setName(String Name) {
        super.Name = Name;
    }

}