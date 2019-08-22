/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Java_HW.Question_11_08;

/**
 * @author AHMED ABUWARDA.
 */

import java.util.Date;
import java.util.ArrayList;

public class Account {

    // Data fields.
    private String name;
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;
    private ArrayList<Transaction> transactions;

    // Creates a default account.
    Account() {

        name = "";
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
        transactions = new ArrayList<Transaction>();

    }

    /**
     * Creates an account with the specified id and initial balance.
     *
     * @param id      An int Id.
     * @param balance Double balance.
     */
    private Account(int id, double balance) {

        name = "";
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
        transactions = new ArrayList<Transaction>();

    }

    /**
     * Creates an account with the specified name,id and initial balance.
     *
     * @param name    Name.
     * @param id      Id.
     * @param balance Balance.
     */
    Account(String name, int id, double balance) {

        this(id, balance);
        this.name = name;

    }

    /**
     * @param name Set new name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return name.
     */
    public String getName() {
        return name;
    }

    /**
     * @param id Set id.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param balance Set balance.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @param annualInterestRate Set annualInterestRate.
     */
    void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    /**
     * @return id.
     */
    public int getId() {
        return id;
    }

    /**
     * @return Balance.
     */
    double getBalance() {
        return balance;
    }

    /**
     * @return Annual InterestRate.
     */
    double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /**
     * @return Date Created.
     */
    public String getDateCreated() {
        return dateCreated.toString();
    }

    /**
     * @return Monthly interest rate.
     */
    private double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    /**
     * @return Monthly interest.
     */
    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100);
    }

    /**
     * @param amount Decrease balance by amount.
     */
    void withdraw(double amount) {

        balance -= amount;
        transactions.add(new Transaction('W', amount, balance,
                "Withdrawal from account"));

    }

    /**
     * @param amount Increase balance by amount.
     */
    void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction('D', amount, balance,
                "Deposit to account"));
    }

    /**
     * @return transactions.
     */
    ArrayList<Transaction> getTransactions() {
        return transactions;
    }

}