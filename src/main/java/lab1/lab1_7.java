package lab1;
import java.util.Scanner;
public class lab1_7 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        short a = (short)in.nextInt();
        short b = (short)in.nextInt();
        System.out.println("sum: "+(int)(0xFFFF & (a+b)));
        System.out.println("difference: "+(int)(0xFFFF & (a-b)));
        System.out.println("product: "+(int)(0xFFFF & (a*b)));
        System.out.println("quotient: "+(int)(0xFFFF & (a/b)));
        System.out.println("remainder: "+(int)(0xFFFF & (a%b)));
    }
}
