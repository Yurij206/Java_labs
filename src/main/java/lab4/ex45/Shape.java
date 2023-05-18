package ex45;

import ex123.Point;

public abstract class Shape {
    Point point;

    Shape(Point point) {
        this.point = point;
    }

    public void moveBy(double x, double y) {
        point = point.add(x, y);
    }

    abstract public Point getCenter();

    abstract public Shape clone();
}
