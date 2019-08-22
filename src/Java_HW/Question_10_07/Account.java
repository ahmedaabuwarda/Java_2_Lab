/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_HW.Question_10_07;

import java.util.Date;

/**
 *
 * @author AHMED ABUWARDA
 */
public class Account {

    // Data fields
    private int id;
    private double balance;
    private static double annualInterestRate;
    private final Date dateCreated;

    // Constructors
    /**
     * Creates a default account
     */
    Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    /**
     * Creates an account with the specified id and initial balance
     */
    Account(int newId, double newBalance) {
        
        id = newId;
        balance = newBalance;
        dateCreated = new Date();
    
    }

    /**
     * Set id
     * @param newId 
     */
    public void setId(int newId) {
        id = newId;
    }

    /**
     * Set balance
     * @param newBalance 
     */
    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    /**
     * Set annualInterestRate
     * @param newAnnualInterestRate 
     */
    public void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
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
    }

    /**
     * Increase balance by amount 
     * @param amount 
     */
    public void deposit(double amount) {
        balance += amount;
    }

}
