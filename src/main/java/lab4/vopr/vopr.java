package lab4.vopr;


import java.util.HashMap;

public class vopr {
    public static void main(String[] args) {
        double x = 5;
        double y = 7;

        double x1 = 7;
        double y1 = 10;
        double height = 5;
        double width = 7;
        double radius = 8;
        Point point2 = new Point(x1, y1);
        Point point = new Point(x, y);
        Point point1 = new Point(x, y);
        System.out.println("Хэш point: "+point.hashCode());
        System.out.println("Хэш point1: "+point1.hashCode());
        System.out.println("Хэш point2: "+point2.hashCode());
        System.out.println("Сравнение point и point1: "+point.equals(point1));
        System.out.println("Сравнение point и point2: "+point.equals(point2));

        HashMap<Integer, Point> points = new HashMap<>();
        points.put(point2.hashCode(), point2);
        points.put(point.hashCode(), point);
        points.put(point1.hashCode(), point1);
        System.out.println(points);
//        Point get_point = points.get(point.hashCode());
//        Point get_point1 = points.get(point_to.hashCode());
//        System.out.println(get_point);
//        System.out.println(get_point1);
    }
}
