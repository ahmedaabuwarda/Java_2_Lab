/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_11;

/**
 * @author AHMED ABUWARDA.
 */
class _01_Person {

    /**
     * Variables "data fields".
     */
    String fName;
    String lName;
    int age;
    int ID;

    /**
     * Default constructor.
     */
    _01_Person() {

    }

    /**
     * Another constructor.
     *
     * @param perfName Person First Name.
     * @param perlName Person Last Name.
     * @param perAge   Person Age.
     * @param perID    Person Id.
     */
    _01_Person(String perfName, String perlName, int perAge, int perID) {

        // Assign values.
        this.fName = perfName;
        this.lName = perlName;
        this.age = perAge;
        this.ID = perID;

    }

    /**
     * @return Full name.
     */
    String getFullName() {
        return fName + " " + lName;
    }

}