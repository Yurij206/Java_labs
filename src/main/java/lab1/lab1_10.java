package lab1;
import java.util.Random;
public class lab1_10 {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.print(Long.toUnsignedString(rand.nextLong(), 36));
    }
}
