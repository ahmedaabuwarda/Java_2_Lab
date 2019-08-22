package Lab_12;

public class Bank {

    private int account_number;
    private double balance;
    private String name;
    private String email;
    private String phone;

    public Bank() {
    }

    public Bank(int account_number, double balance, String name, String email, String phone) {
        this.account_number = account_number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}