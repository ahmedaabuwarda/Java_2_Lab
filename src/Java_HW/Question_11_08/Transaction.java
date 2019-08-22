/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Java_HW.Question_11_08;

/**
 * @author AHMED ABUWARDA.
 */
public class Transaction {

    // Data Field.
    private final java.util.Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    /**
     * Construts a Transaction with specified date, type, balance and description.
     *
     * @param type        Type.
     * @param amount      Amount.
     * @param balance     Balance.
     * @param description Description.
     */
    Transaction(char type, double amount, double balance, String description) {

        date = new java.util.Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;

    }

    /**
     * @return Date.
     */
    String getDate() {
        return date.toString();
    }

    /**
     * @param type Set a new type.
     */
    public void setType(char type) {
        this.type = type;
    }

    /**
     * @return type.
     */
    char getType() {
        return type;
    }

    /**
     * @param amount Set new amount.
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return amount.
     */
    double getAmount() {
        return amount;
    }

    /**
     * @param balance Set a new balance.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return balance.
     */
    double getBalance() {
        return balance;
    }

    /**
     * @param description Set a new description.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return description.
     */
    String getDescription() {
        return description;
    }

}