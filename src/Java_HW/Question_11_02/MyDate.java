 /*
  * To change this template file, choose Settings | Editor | File and Code Templates
  * and change the template in the editor.
  */

 package Java_HW.Question_11_02;

 import java.util.GregorianCalendar;

 /**
  * @author AHMED ABUWARDA.
  */
 public final class MyDate {

     // Data Fields.
     private int year;
     private int month;
     private int day;

     // Creates a MyDate object for the current date.
     MyDate() {

         GregorianCalendar calander = new GregorianCalendar();
         year = calander.get(GregorianCalendar.YEAR);
         month = calander.get(GregorianCalendar.MONTH);
         day = calander.get(GregorianCalendar.DAY_OF_MONTH);

     }

     /**
      * Creates a MyDate object with a specified elapsed time since midnight,
      * January 1, 1970, in milliseconds.
      *
      * @param elapsedTime ElapsedTime.
      */
     MyDate(long elapsedTime) {

         setDate(elapsedTime);

     }

     /**
      * Creates a MyDate object with the specified year, month, and day.
      *
      * @param year  An int year.
      * @param month An int month.
      * @param day   An int day.
      */
     MyDate(int year, int month, int day) {

         this.year = year;
         this.month = month;
         this.day = day;

     }

     /**
      * @return year.
      */
     int getYear() {

         return year;

     }

     /**
      * @return month.
      */
     String getMonth() {

         String m = String.valueOf(month + 1);
         return (month < 10 ? "0" + m : m);

     }

     /**
      * @return day
      */
     String getDay() {

         String d = String.valueOf(day);
         return (day < 10 ? "0" + d : d);

     }

     /**
      * Sets a new date for the object using the elapsed time.
      *
      * @param elapsedTime ElapsedTime.
      */
     private void setDate(long elapsedTime) {

         GregorianCalendar calander = new GregorianCalendar();
         calander.setTimeInMillis(elapsedTime);
         year = calander.get(GregorianCalendar.YEAR);
         month = calander.get(GregorianCalendar.MONTH);
         day = calander.get(GregorianCalendar.DAY_OF_MONTH);

     }

 }