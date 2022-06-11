package com.alpercaktug.oop;


/*
    A constructor in Java is a special method that is used to initialize objects.
    The constructor is called when an object of a class is created.
    It can be used to set initial values for object attributes.

    Constructor name must match the class name, and it cannot have a return type.
 */


//Bank Account
public class Constructors {

    private String accountNumber;
    private String customerName;
    private String mail;
    private String phoneNumber;
    private double balance;


    public Constructors(String accountNumber, String customerName, String mail, String phoneNumber, double balance) {
        System.out.println("Account constructor called with parameters.");
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }

    public Constructors(String customerName, String mail, String phoneNumber) {
        this("9999", customerName, mail, phoneNumber, 100);
    }

    public Constructors(){
        this("0","Default Name", "Default@mail", "0000 000 00 00", 0.0);
        System.out.println("Empty constructor called");
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount){
        if (this.balance - withdrawalAmount < 0){
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        }
        else{
            this.balance = this.balance - withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed, Remaining balance = " + this.balance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
