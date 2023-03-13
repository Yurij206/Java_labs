package lab1;

import java.util.Scanner;
public class lab1_1 {
        public static void main(String[] args) {
            System.out.print("Enter int number:");
            int number = checknumberinput();
            System.out.printf("number in 2 %s\nnumber in 8 %o\nnumber in 16 %x",Integer.toString(number, 2) ,number,number);
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
