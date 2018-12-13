package com.company;
import com.company.Circle;
import com.company.Shape;

public class Rectangle extends Shape {
    private double width=1.0;
    private double length=1.0;
    public Rectangle()
    {
        this.width=5;
        this.length=10;
    }
    public Rectangle(double width, double length)
    {
        this.width=width;
        this.length=length;

    }
    public Rectangle (double width, double length, String color, Boolean filled)
    {
        this.width=width;
        this.length=length;


    }
    public double getWidth()
    {
        return width;
    }
    public  void setWidth(double width)
    {
        this.width=width;
    }
    public double getLength()
    {
        return length;
    }
    public void setLength(double length)
    {
        this.length=length;
    }
    public double getArea()
    {
        return width * length;

    }
    public double getPerimeter()
    {
        return 2 * (length + width);
    }
    public String toSring()
    {
        String w;
        String l;
        w=Double.toString(getWidth());
        l=Double.toString(getWidth());
        return "(" + w + "," + l + ")";
    }



}
