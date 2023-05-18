package lab4.lab4_3;

public class lab4_3 {
    public static void main(String[] args) {
        int x=5;
        int y=7;
        String lable = "first";
        Point first = new Point(x,y);
        System.out.println("Объект суперкласса Point:"+"\n"+first.x+"\n"+first.y);
        LabledPoint labledFirst = new LabledPoint(lable,x,y);
        System.out.println("Объект подкласса LabledPoint:"+"\n"+labledFirst.x+"\n"+labledFirst.y+"\n"+labledFirst.getLable());
    }
}
