import com.company.Rectangle;

public class Square extends Rectangle {
    private double side;

    public Square()
    {

    }
    public Square(double side)
    {

    }
    public  Square(double side, String color, Boolean filled)
    {

    }
    public double getSide()
    {
        return side;
    }

    public void setSide(double side)
    {
        this.side=side;

    }
    public void setWidth(double side)
    {
        this.side=getWidth();
    }
    public void setLength(double side)
    {
        this.side=getLength();
    }
    public String toString()
    {
        String s;
        s=Double.toString(getSide());
        return"(" + s + ")";
    }

}
