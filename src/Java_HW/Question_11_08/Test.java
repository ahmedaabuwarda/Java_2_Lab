/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Java_HW.Question_11_08;

/**
 * @author AHMED ABUWARDA.
 */
public class Test {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        // Create an Account object.
        Account account = new Account("George", 1122, 1000);

        // Set annual interest rate to 1.5%.
        account.setAnnualInterestRate(1.5);

        // Deposit $30, $40, and $50 to the account.
        account.deposit(30);
        account.deposit(40);
        account.deposit(50);

        // Withdraw $5, $4, and $2 from the account.
        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);

        // Print an account summary.
        System.out.println("       Account Summary");
        System.out.println("------------------------------------");
        System.out.println("Account holder name: " + account.getName());
        System.out.println("Interest rate: " + account.getAnnualInterestRate());
        System.out.printf("Balance: $%.2f\n", account.getBalance());
        System.out.println("\n     List of transactions");
        System.out.println("------------------------------------");

        // For loop.
        for (int i = 0; i < account.getTransactions().size(); i++) {
            System.out.println("Date: "
                    + (account.getTransactions()).get(i).getDate());
            System.out.println("Type: "
                    + (account.getTransactions()).get(i).getType());
            System.out.println("Amount: "
                    + (account.getTransactions()).get(i).getAmount());
            System.out.println("Balance: "
                    + (account.getTransactions()).get(i).getBalance());
            System.out.println("Description: "
                    + (account.getTransactions()).get(i).getDescription());
            System.out.println();

        }

    }

}