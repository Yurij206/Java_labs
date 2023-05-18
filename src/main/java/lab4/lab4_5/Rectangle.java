package lab4.lab4_5;

public class Rectangle extends Shape {

    private Point topLeft;
    private double width;
    private double height;
    public Rectangle(Point topLeft, double width, double height){
        super(topLeft);
        this.height=height;
        this.width=width;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public void setWidth(double width) {
        this.width=width;
    }
    public void setHeight(double height){
        this.height=height;
    }

    public Rectangle clone(){
        return new Rectangle(getCenter(),getWidth(),getHeight());
    }
}
