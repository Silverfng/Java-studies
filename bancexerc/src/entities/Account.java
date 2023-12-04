package entities;

public class Account {


    //attributes
    private final int accNumber;
    private String holder;
    private double balance;


    //constructor
    public Account(int accNumber, String holder) {
        this.accNumber = accNumber;
        this.holder = holder;
    }

    public Account(int accNumber, String holder, double balance) {
        this.accNumber = accNumber;
        this.holder = holder;
        this.balance = balance;
    }


    //getters and setters
    public int getAccNumber() {
        return accNumber;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    //methods
    public void deposit(double balance) {
        this.balance += balance;
    }

    public void withdraw(double balance) {
        this.balance -= balance + 5.00;
    }



    public String toString() {
        return "Account " + accNumber
                + ", Holder: " + holder
                + ", Balance: $ " + balance;
    }
}
