package ex45;

import ex123.Point;

public class Line extends Shape{

    Point to;

    Line(Point from, Point to){
        super(from);
        this.to = to;
    }

    @Override
    public Point getCenter() {
        return new Point(point.getX() + (to.getX() - point.getX())/2, point.getY() + (to.getY() - point.getY())/2);
    }

    @Override
    public Line clone() {
        return new Line(point, to);
    }
}
