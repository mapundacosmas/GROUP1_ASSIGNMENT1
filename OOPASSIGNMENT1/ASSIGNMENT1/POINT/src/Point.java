public class Point {
    private int x=0;
    private int y=0;

    public Point(){

    }
    public Point(int x,int y){

    }
    public int getX(){
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    


    public String toString() {
        return "x is"+Integer.toString(this.x)+",y is"+Integer.toString(this.y);
    }
}
