package com.company;

import com.company.Circle;
import com.company.Cylinder;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Circle c1 = new Circle();
        Cylinder p1 = new Cylinder();
        System.out.println("Area is: "+c1.getArea());
        System.out.println("volume is:  " +p1.getVolume());
        System.out.println(c1.toString());


    }
}
