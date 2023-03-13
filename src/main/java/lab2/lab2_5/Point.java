package lab2.lab2_5;

class Point {
    private final double x, y;
    public Point()
    {
        this.x = 0;
        this.y = 0;
    }
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }
    public Point translate(double offsetX, double offsetY)
    {
        return new Point(x + offsetX, y + offsetY);
    }
    public Point scale(double multiplier)
    {
        return new Point(x * multiplier, y * multiplier);
    }
}
