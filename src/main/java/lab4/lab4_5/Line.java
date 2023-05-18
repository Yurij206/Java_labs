package lab4.lab4_5;

public class Line extends Shape {
    private Point to;
    public Line(Point from, Point to){
        super(from);
        this.to=to;
    }
    public Point getTo() {
        return to;
    }
    public void setTo(Point to) {
        this.to = to;
    }
    public Line clone(){
        return new Line(getCenter(),getTo());
    }
}
