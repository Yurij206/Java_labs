package lab1;
import java.util.Scanner;
import static java.lang.Math.floorMod;
public class lab1_2 {
        public static void main(String[] argv) {
            System.out.print("Enter corner:");
            int number = checknumberinput();
            System.out.print("%: " + number % 360 + "\nfloorMod(): " + floorMod(number, 360));
        }
    public static int checknumberinput() {
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            return in.nextInt();
        } else {
            throw new RuntimeException("It's not int number!");
        }
    }
}
