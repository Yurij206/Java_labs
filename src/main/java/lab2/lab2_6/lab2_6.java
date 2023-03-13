package lab2.lab2_6;

public class lab2_6 {
    public static void main(String[] args)
    {
        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.printf("x = %s\ny = %s", p.getX(), p.getY());
    }
}
