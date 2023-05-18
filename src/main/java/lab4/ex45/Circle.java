package ex45;

import ex123.Point;

public class Circle extends Shape{
        double radius;

        Circle(Point center, double radius){
            super(center);
            this.radius = radius;
        }


        @Override
        public Point getCenter() {
        return point;
    }

    public Circle clone(){
            return new Circle(point, radius);
    }


}
