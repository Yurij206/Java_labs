package ex45;

import ex123.Point;

public class main45 {
    public static void main(String[] args) {

        Line line = new Line(new Point(-1, 0), new Point(-4, 6));
        Rectangle rectangle = new Rectangle(new Point(0, 10), 6, 4);
        Circle circle = new Circle(new Point(5, -1), 10);

        System.out.println(circle.getCenter() + "\n" + rectangle.getCenter() + "\n" + line.getCenter());

        Line lineClone = line.clone();
        Rectangle rectangleClone = rectangle.clone();
        Circle circleClone = circle.clone();

        System.out.println(circle.getCenter() + "\n" + rectangle.getCenter() + "\n" + line.getCenter());
    }
}
