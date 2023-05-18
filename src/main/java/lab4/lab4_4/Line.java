package lab4.lab4_4;

public class Line extends Shape {
    private  Point to;
    public Line(Point from,Point to){
        super(from);
        this.to=to;
    }
    public Point getTo() {
        return to;
    }
    public void setTo(Point to) {
        this.to = to;
    }
}
