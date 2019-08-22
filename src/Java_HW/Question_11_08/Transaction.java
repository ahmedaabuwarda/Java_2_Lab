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
public class Transaction {

    private final java.util.Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    /**
     * Construts a Transaction with specified date, type, balance and
     * description
     * 
     * @param type
     * @param amount
     * @param balance
     * @param description 
     */
    public Transaction(char type, double amount,
            double balance, String description) {
        date = new java.util.Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    /**
     * @return Date
     */
    public String getDate() {
        return date.toString();
    }

    /**
     * Set a new type
     * @param type 
     */
    public void setType(char type) {
        this.type = type;
    }

    /**
     * @return type
     */
    public char getType() {
        return type;
    }

    /**
     * Set new amount
     * @param amount 
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Set a new balance
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Set a new description
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }
}
