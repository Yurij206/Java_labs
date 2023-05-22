package lab4.dop;


import java.util.Objects;

public class Point {
    private double x=0;
    private double y=0;
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y=y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    @Override
    public String toString(){
        return getClass().getName() + "[ x="+ Double.toString(getX()) + ", "+ "y="+ Double.toString(getY())+" ]";
    }
    @Override
    public boolean equals(Object otherObject){
        if(this == otherObject) return true;
        if(otherObject == null) return false;
        if(this.getClass() != otherObject.getClass()) return false;
        lab4.lab4_5.Point other= (lab4.lab4_5.Point) otherObject;
        return Objects.equals(getX(),other.getX()) && Objects.equals(getY(),other.getY());
    }
    @Override
    public int hashCode(){
        return Objects.hash(getX(),getY());
    }
}

