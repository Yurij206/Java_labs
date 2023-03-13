package lab2.lab2_6;

public class Point {
        private double x, y;
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
            x += offsetX;
            y += offsetY;
            return this;
        }
        public Point scale(double multiplier)
        {
            x *= multiplier;
            y *= multiplier;
            return this;
        }
}
