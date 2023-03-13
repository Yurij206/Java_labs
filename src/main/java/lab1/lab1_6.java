package lab1;
import java.math.BigInteger;
import java.util.Scanner;

public class lab1_6 {
    public static void main(String[] args) {
        System.out.print("Enter int n:");
        int number = checknumberinput();
        System.out.println("n! = " + factorial(number).toString());
    }
    public static BigInteger factorial(int n) {
        BigInteger factorial = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
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
