/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_12.Excersie;

/**
 *
 * @author AHMED ABUWARDA
 */
public class _04_Ex01_Bank {
    
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phone;

    public _04_Ex01_Bank() {
    }

    public _04_Ex01_Bank(int accountNumber, double balance, String customerName, String email, int phone) {
        
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
        
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    
    public void depositFunds(double value){
        this.balance = this.balance + value;
    }
    
    public void withdrawFunds(double value){
        this.balance = this.balance - value;
    }
    
}
