package com.company;

import com.company.Account;

public class TestAccount {

    public static void main(String[] args) {
	// write your code here
        Account AC1= new Account(1234,600);
        System.out.println(AC1.toString());

       AC1.debit(50);
       AC1.credit(60);
        System.out.println(AC1.toString());

    }
}
