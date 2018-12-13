  package com.company;
  public class Circle extends com.company.Shape {

        private double radius=1.0;
        public Circle()
        {
           super();
           this.radius=1.0;
        }
        public Circle(double radius)
        {
            super();
            this.radius=radius;
        }
        public Circle ( double radius, String color, Boolean filled)
        {
                super(color,filled);
        }
        public double getRadius()
        {
            return radius;
        }
        public void setRadius()
        {

        }
        public double getArea()
        {
            return radius * radius * Math.PI;
        }
        public double getPerimeter()
        {
            return 2 * radius * Math.PI;
        }
        public String toString()
        {
            return"(" + radius + ")";
        }





    }
