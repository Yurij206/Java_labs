package lab1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
public class lab1_14 {


    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String line;
        String[] subStr;
        ArrayList<ArrayList> square = new ArrayList<>();
        while(true)
        {
            ArrayList<Integer> row = new ArrayList<>();
            line = in.nextLine();
            if (line == "")
                break;
            subStr = line.split(" ");
            for(int i = 0; i < subStr.length; i++)
            {
                row.add(Integer.parseInt(subStr[i]));
            }
            square.add(row);
        }

        if (isSquare(square))
            isMagic(square);
        else
            System.out.println("Not square");
    }
        static int isMagic(ArrayList<ArrayList> square)
        {
            int sum = 0;
            for (int i = 0; i < square.size(); i++)
                sum += (int)square.get(i).get(i);
            int check = 0;
            for (int i = 0; i < square.size(); i++)
                check += (int)square.get(i).get(square.size() - i - 1);
            if (sum != check)
            {
                System.out.println("No");
                return 0;
            }
            for (int i = 0; i < square.size(); i++)
            {
                check = 0;
                for (int j = 0; j < square.size(); j++)
                    check += (int)square.get(i).get(j);
                if (sum != check)
                {
                    System.out.println("No");
                    return 0;
                }
            }
            for (int i = 0; i < square.size(); i++)
            {
                check = 0;
                for (int j = 0; j < square.size(); j++)
                    check += (int)square.get(j).get(i);
                if (sum != check)
                {
                    System.out.println("No");
                    return 0;
                }
            }
            System.out.println("Yes");
            return 0;
        }
        static boolean isSquare(ArrayList<ArrayList> square)
        {
            HashSet<Integer> length = new HashSet<Integer>();
            for (int i = 0; i < square.size(); i++)
            {
                length.add((int) square.get(i).size());
            }
            length.add((int) square.size());
            if (length.size() > 1)
                return false;
            else
                return true;
        }
}
