package lab1;
import java.util.Arrays;
import java.util.Scanner;
public class lab1_8 {
    public static void main(String[] args) {
        System.out.print("Enter string:");
        Scanner in = new Scanner(System.in);
        String[] line=in.nextLine().split("\\s+");
        System.out.println("Array string = " + Arrays.toString(line));
    }
}
