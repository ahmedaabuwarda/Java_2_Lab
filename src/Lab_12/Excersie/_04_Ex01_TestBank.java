/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_12.Excersie;

/**
 * @author AHMED ABUWARDA.
 */
public class _04_Ex01_TestBank {

    /**
     * @param args the command line arguments.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        // Create user1 object from _04_Ex01_Bank class, And assign values to it
        _04_Ex01_Bank user1 = new _04_Ex01_Bank(12016666, 20.19,
                "Ahmed Abuwarda", "abu@bank.com", 599409772);

        // If you want to add new balance to your account.
        double value = 120.45;

        if (value > 0) {

            System.out.println("You have in your account: " + user1.getBalance() + " $");

            // Add value to your account.
            user1.depositFunds(value);

            System.out.println("You have added to your account: " + value + " $"
                    + " your new balanced is: " + user1.getBalance() + " $");

        } else {
            System.out.println("You have entered an Invalid value,Please try again!");
        }

        // If you want to withdraw new balance from your account.
        double value2 = 100.12;

        // If statement.
        if (user1.getBalance() > 0 && value2 < user1.getBalance()) {

            // Withdraw value from your account.
            user1.withdrawFunds(value2);

            System.out.println("You have withdrow: " + value2 + " from your account,"
                    + " your new balance is: " + user1.getBalance());

        } else {
            System.out.println("You don't have enough balance in your account!");
        }

    }

}