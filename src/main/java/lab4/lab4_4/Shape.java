package lab4.lab4_4;

public abstract class Shape {
    private Point center;
    public Shape(Point c){
        this.center=c;
    }
    public void moveBy(double dx,double dy){
        center.setX(center.getX()+dx);
        center.setY(center.getY()+dy);
    }
    public Point getCenter(){
        return center;
    }
    public void setCenter(Point center) {
        this.center = center;
    }
}
