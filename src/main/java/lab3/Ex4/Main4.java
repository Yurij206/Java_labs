package Ex4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        while (in.hasNextInt()){
                arr.add(in.nextInt());
        }
        IntSequence IS = IntSequence.of(arr);
        while (IS.hasNext()) {
            System.out.println(IS.next());
        }

    }
}
