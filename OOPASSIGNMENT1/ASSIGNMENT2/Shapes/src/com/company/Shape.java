package com.company;
public class Shape {

    private String color="red";
    private Boolean filled = true;
    public Shape()
    {
        this.color="red";
        this.filled=true;
    }
    public Shape(String color, Boolean filled)
    {
        this.color=color;
        this.filled=filled;
    }
    public String getColor()
    {
        return color;
    }
    public void setColor( String color)
    {
             this.color=color;
    }
    public Boolean isFilled()
    {
        return filled;
    }
    public void isFilled(Boolean filled)
    {
           this.filled=filled;
    }


}
