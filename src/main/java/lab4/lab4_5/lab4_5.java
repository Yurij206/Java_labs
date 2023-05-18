package lab4.lab4_5;

import lab4.lab4_4.Circle;
import lab4.lab4_4.Point;
import lab4.lab4_4.Rectangle;

public class lab4_5 {
    public static void main(String[] args) {
        double x = 5;
        double y = 7;

        double x1 = 7;
        double y1 = 10;
        double height = 5;
        double width = 7;
        double radius = 8;
        Point point_to = new lab4.lab4_4.Point(x1, y1);
        Point point = new Point(x, y);
        Rectangle rec = new Rectangle(point, width, height);
        Circle cic = new Circle(point, radius);

    }
}
