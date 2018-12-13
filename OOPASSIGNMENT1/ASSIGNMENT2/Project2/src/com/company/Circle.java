package com.company;
public class Circle {
    private double radius;
    private String color;

    public Circle(){
        this.radius=1.0;
        this.color="blue";

    }
    public Circle(double r)
    {
     this.radius=r;
     this.color="blue";
    }

    public Circle (double r,String c){
        this.radius=r;
        this.color=c;
    }

    public double getRadius()
    {
        return this.radius;
    }
    public void setRadius()
    {
        this.radius=radius;
    }
    public String getColor()
    {
        return this.color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }
    public double getArea()
    {
        return Math.PI*radius*radius;
    }
    public String toString(){

        return" (Circle r=" + radius + " ,color c=" + color + ")";
    }

}
