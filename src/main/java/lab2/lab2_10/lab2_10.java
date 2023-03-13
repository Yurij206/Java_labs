package lab2.lab2_10;

import java.util.LinkedList;
import java.util.List;
public class lab2_10 {
    public static void main(String[] args) {
        int[] mass= {1,2,3,4,5,6,7,8,9,10};
        List<Integer> number_list = new LinkedList<>();
        for(Integer number : mass)
            number_list.add(number);
        System.out.println("[] = " + RandomNumbers.randomElement(number_list) +
                "\nlist = " + RandomNumbers.randomElement(mass));
    }
}
