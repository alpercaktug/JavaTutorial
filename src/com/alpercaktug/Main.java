package com.alpercaktug;

import com.alpercaktug.oop.*;

public class Main {

    public static void main(String[] args) {
        Constructors account = new Constructors();//("1","Alper Çaktuğ", "alpercktg@gmail.com", "0530 090 52 94", 0.0);
        System.out.println(account.getAccountNumber());
        System.out.println(account.getCustomerName());
        System.out.println(account.getPhoneNumber());
        System.out.println(account.getMail());

        account.deposit(100);
        account.withdrawal(20);

        System.out.println(account.getBalance());

        Constructors account1 = new Constructors();


    }

}
