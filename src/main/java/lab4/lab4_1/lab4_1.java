package lab4.lab4_1;

public class lab4_1 {

    public static void main(String[] args) {
        int x=5;
        int y=7;
        String lable = "first";
        Point first = new Point(x,y);
        System.out.println("Объект суперкласса Point:"+"\n"+first.getX()+"\n"+first.getY());
        LabledPoint labledFirst = new LabledPoint(lable,x,y);
        System.out.println("Объект подкласса LabledPoint:"+"\n"+labledFirst.getX()+"\n"+labledFirst.getY()+"\n"+labledFirst.getLable());
    }
}
