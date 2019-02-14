package kilango;

public class Circle {
    private double radius = 0.0;

    public Circle(){

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

   public double getArea(){
        return Math.PI*this.radius*this.radius;
   }

   public String toString(){
        return Double.toString(getArea());
   }
}
