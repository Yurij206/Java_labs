package lab4.lab4_2;

public class lab4_2 {
    public static void main(String[] args) {
        int x=5;
        int y=7;
        String lable_first = "first";
        String lable_third = "third";
        Point first = new Point(x,y);
        Point second = new Point(x,y);
        Point third = new Point(y,x);
        System.out.println("Объект суперкласса Point:"+"\n"+first.getX()+"\n"+first.getY());
        System.out.println(first);
        System.out.println(first.hashCode());
        System.out.println(second.equals(first));
        System.out.println(third.equals(first));
        LabledPoint labledFirst = new LabledPoint(lable_first,x,y);
        LabledPoint labledSecond = new LabledPoint(lable_first,x,y);
        LabledPoint labledThird = new LabledPoint(lable_third,x,y);
        System.out.println("Объект подкласса LabledPoint:"+"\n"+labledFirst.getX()+"\n"+labledFirst.getY()+"\n"+labledFirst.getLable());
        System.out.println(labledFirst);
        System.out.println(labledFirst.hashCode());
        System.out.println(labledFirst.equals(labledSecond));
        System.out.println(labledFirst.equals(labledThird));
    }
}
