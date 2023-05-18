package lab4.lab4_4;

import java.security.PrivateKey;

public class Circle extends Shape {
    private double radius;
    public Circle(Point center, double radius){
        super(center);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
