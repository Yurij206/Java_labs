package lab4.lab4_2;

import java.util.Objects;

public class LabledPoint extends Point {
    private String lable;
    public LabledPoint(String lable, int x, int y){
        super(x,y);
        this.lable=lable;
    }
    public String getLable(){
        return lable;
    }

    public String toString(){
        return super.toString() + " lable: "+lable;
    }
    public boolean equals(Object otherObject){
        if(this == otherObject) return true;
        if(otherObject == null) return false;
        if(getClass()!=otherObject.getClass()) return false;
        if(!(super.equals(otherObject))) return false;
        LabledPoint other= (LabledPoint) otherObject;
        return Objects.equals(getLable(),other.getLable());
    }
    public int hashCode(){
        return Objects.hash(super.hashCode(),getLable());
    }
}
