package com.company;

import com.company.Time;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Time T1 = new Time();
        Time T2 = new Time(12,43,6);
        System.out.println(T1.toString());
        System.out.println(T2.toString());
    }
}
