package lab1;
import java.util.Scanner;
public class lab1_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string1:");
        String string1 = in.nextLine();
        System.out.print("Enter string2:");
        String string2 = in.nextLine();
        System.out.println("string1 == string2\nIgnore case:" + string1.trim().equalsIgnoreCase(string2.trim()));
    }
}
