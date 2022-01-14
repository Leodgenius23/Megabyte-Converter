package com.company;

public class BankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public BankAccount(){
        this("492304",42452,"DefaultName","DefaultEmailAddress","DefaultPhoneNumber");
        System.out.println("Second Constructor to be called");
    }
    public BankAccount(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
        System.out.println("First Constructor to be called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(int deposit){
        balance += deposit;
        System.out.println("Deposit of " + deposit + " made. New balance is " + balance);
    }

    public void withdrawal(int withdrawal){
        if(balance - withdrawal < 0){
            System.out.println("Only balance of " + balance + "remaining. Withdrawal not processed.");
        }else{
            balance -= withdrawal;
            System.out.println("Withdrawal of " + withdrawal + ". Remaining balance is " + balance);
        }
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
