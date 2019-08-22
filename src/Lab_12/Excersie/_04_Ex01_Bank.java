/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab_12.Excersie;

/**
 * @author AHMED ABUWARDA.
 */
public class _04_Ex01_Bank {

    // Date Fields.
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phone;

    // Default constructor.
    public _04_Ex01_Bank() {

    }

    /**
     * @param accountNumber Account number.
     * @param balance       Balance.
     * @param customerName  CustomerName.
     * @param email         Email.
     * @param phone         Phone.
     */
    _04_Ex01_Bank(int accountNumber, double balance, String customerName, String email, int phone) {

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;

    }

    /**
     * @return Account number.
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber Set account number.
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @return Balance.
     */
    double getBalance() {
        return balance;
    }

    /**
     * @param balance Set balance.
     */
    public void setBalance(int balance) {
        this.balance = balance;
    }

    /**
     * @return Customer name.
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName Set customer name.
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * @return Email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email Set email.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return Phone.
     */
    public int getPhone() {
        return phone;
    }

    /**
     * @param phone Set phone.
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }

    /**
     * @param value Set value.
     */
    void depositFunds(double value) {
        this.balance = this.balance + value;
    }

    /**
     * @param value Withdraw Value
     */
    void withdrawFunds(double value) {
        this.balance = this.balance - value;
    }

}