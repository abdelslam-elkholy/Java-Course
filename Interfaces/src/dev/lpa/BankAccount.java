package dev.lpa;

public class BankAccount {
    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
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

    public void withdrawl(int value){
        if (this.balance - value < 0)
        {
            System.out.println("Isufficent funds");
            return;
        }

        this.balance = this.balance - value;

        System.out.println("Your balance succesfully credites with  " + value + "and no you have " + this.balance);
    }

    public void deposit(int value){

        this.balance = this.balance + value;

        System.out.println("Your balance succesfully credites with  " + value + "and no you have " + this.balance);
    }
}
