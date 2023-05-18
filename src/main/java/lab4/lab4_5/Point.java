package lab4.lab4_5;

import java.util.Objects;

public class Point {
    private double x;
    private double y;
    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }
    public double getX(){ return x;}
    public double getY(){return y;}
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
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
        Point other= (Point) otherObject;
        return Objects.equals(getX(),other.getX()) && Objects.equals(getY(),other.getY());
    }
    @Override
    public int hashCode(){
        return Objects.hash(getX(),getY());
    }
}
