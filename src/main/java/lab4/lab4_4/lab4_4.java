package lab4.lab4_4;


public class lab4_4 {
    public static void main(String[] args) {
        double x = 5;
        double y = 7;

        double x1 = 7;
        double y1 = 10;
        double height = 5;
        double width = 7;
        double radius = 8;
        Point point_to = new Point(x1, y1);
        Point point = new Point(x, y);
        Rectangle rec = new Rectangle(point, width, height);
        Circle cic = new Circle(point, radius);
    }
}
