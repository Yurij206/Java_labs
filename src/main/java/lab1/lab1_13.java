package lab1;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
public class lab1_13 {
    public static void main(String[] args)
    {
        Random rand = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < 50; i++)
        {
            numbers.add(i);
        }
        int[] result = new int[6];
        for (int i = 0; i < 6; i++)
        {
            int index = Math.abs(rand.nextInt() % numbers.size());
            result[i] = numbers.get(index);
            numbers.remove(index);
        }
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
    }
}
