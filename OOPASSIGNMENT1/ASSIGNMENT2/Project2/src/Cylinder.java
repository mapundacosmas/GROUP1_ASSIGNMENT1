package com.company;
import com.company.Circle;
public class Cylinder extends Circle {
   private double height;

    public Cylinder(){
        super();
        this.height=1.0;

    }
    public Cylinder(double r)
    {
        super(r);
       this.height=height;
    }
    public Cylinder(double r,double h)
    {
      super(r);
      this.height=height;
    }
    public Cylinder(double r,double h,String c)
    {
     super(r, c);
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
       return getArea()*height;
    }
}
