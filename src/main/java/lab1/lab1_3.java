package lab1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class lab1_3 {
        public static void main(String[] args) {
            List<Integer> arr = checkarraynumberinput();
            System.out.println("MaxIf = " + maxIf(arr) +
                    "\nMaxMath = " + maxMath(arr));
        }

        public static int maxIf(List<Integer> arr) {
            int max_if = Integer.MIN_VALUE;
            for (int i = 0; i < 3; i++) {
                if (arr.get(i) > max_if) max_if = arr.get(i);
            }
            return max_if;
        }

        public static int maxMath(List<Integer> arr) {
            int max_math = Integer.MIN_VALUE;
            for (int i = 0; i < 3; i++) {
                max_math = Math.max(max_math, arr.get(i));
            }
            return max_math;
        }

        public static List<Integer> checkarraynumberinput() {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter 3 int numbers:");
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                if (in.hasNextInt()) {
                    arr.add(in.nextInt());
                } else {
                    throw new RuntimeException("Number " + in.nextInt()+ " not int number!");
                }
            }
            return arr;
        }
}
