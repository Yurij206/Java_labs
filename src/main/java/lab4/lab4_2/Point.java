package lab4.lab4_2;

import java.util.Objects;

public class Point{
    private int x;
    private int y;
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){ return x;}
    public int getY(){return y;}
    @Override
    public String toString(){
        return getClass().getName() + "[ x="+ Integer.toString(getX()) + ", "+ "y="+ Integer.toString(getY())+" ]";
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
