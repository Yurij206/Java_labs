package ex45;

import ex123.Point;

public class Rectangle extends Shape{

    double width;
    double height;

    Rectangle(Point topLeft, double width, double height) {
        super(topLeft);
        this.height = height;
        this.width = width;
    }

    @Override
    public Point getCenter() {
        return new Point(point.getX() + width/2, point.getY()-height/2);
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(point, width, height);
    }
}
