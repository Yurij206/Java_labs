package lab1;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class lab1_15 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<ArrayList> triangle = new ArrayList<>();
        ArrayList<Integer> line = new ArrayList<>();
        line.add(1);
        triangle.add(line);
        for (int i = 1; i < n; ++i)
        {
            line = new ArrayList<>();
            line.add(1);
            for (int j = 1; j < i; ++j)
            {
                ArrayList<Integer> upper = triangle.get(i - 1);
                line.add(Integer.sum(upper.get(j - 1), upper.get(j)));
            }
            line.add(1);
            triangle.add(line);
        }
        int maxNum = (int)triangle.get(n-1).get((n-1)/2);
        int maxNumWidth = Integer.toString(maxNum).length();
        for (int i = n-1; i >= 0; --i)
        {
            int stringPad = (n - 1 - i) * (maxNumWidth + 1) / 2;
            if (stringPad > 0)
                System.out.print(String.format("%" + stringPad + "s", ""));
            for (int j = 0; j <= i; j++) {
                String paddedNum = Integer.toString((int)triangle.get(i).get((j)));
                int totalPad = maxNumWidth - paddedNum.length();
                int lPad = totalPad / 2;
                int rPad = totalPad - lPad;
                if(lPad!=0)
                    System.out.print(String.format("%" + lPad + "s","" ));
                System.out.print(paddedNum);
                if(rPad!=0)
                    System.out.print(String.format("%" + rPad + "s","" ));
                if (j < i)
                    System.out.print(" ");
                else
                    System.out.println();
            }
        }
    }
}
