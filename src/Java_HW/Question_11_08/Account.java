/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_HW.Question_11_08;

/**
 *
 * @author AHMED ABUWARDA
 */
import java.util.Date;
import java.util.ArrayList;

public class Account {
    
    // Data fields
    private String name;
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;
    private ArrayList<Transaction> transactions;

    /**
     * Creates a default account
     */
    Account() {
        name = "";
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
        transactions = new ArrayList<Transaction>();
    }

    /**
     * Creates an account with the specified id and initial balance
     * @param id
     * @param balance 
     */
    Account(int id, double balance) {
        name = "";
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
        transactions = new ArrayList<Transaction>();
    }

    /**
     * Creates an account with the specified name,id and initial balance
     * 
     * @param name
     * @param id
     * @param balance 
     */
    Account(String name, int id, double balance) {
        this(id, balance);
        this.name = name;
    }

    /**
     * Set new name
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Set id
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Set balance
     * @param balance 
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Set annualInterestRate
     * @param annualInterestRate 
     */
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    /**
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @return annualInterestRate
     */
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /**
     * @return dateCreated
     */
    public String getDateCreated() {
        return dateCreated.toString();
    }

    /**
     * @return monthly interest rate
     */
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    /**
     * @return monthly interest
     */
    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100);
    }

    /**
     * Decrease balance by amount
     * @param amount 
     */
    public void withdraw(double amount) {
        balance -= amount;
        transactions.add(new Transaction('W', amount, balance,
                "Withdrawal from account"));
    }

    /**
     * Increase balance by amount 
     * @param amount 
     */
    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction('D', amount, balance,
                "Deposit to account"));
    }

    /**
     * @return transactions
     */
    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
}
