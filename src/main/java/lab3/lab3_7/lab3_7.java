package lab3.lab3_7;
import java.util.*;
public class lab3_7  {
        static void luckySort(List<String> strings, Comparator<String> comp) {
            while (!checkSort(strings, comp)) {
                Collections.shuffle(strings);
            }
        }

        static boolean checkSort(List<String> strings, Comparator<String> comp) {
            for (int i = 1; i < strings.size(); i++) {
                if (comp.compare(strings.get(i - 1), strings.get(i)) >= 0) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            List<String> listString = new ArrayList<>();
            Random rand = new Random();
            for(int i=0; i<5; i++)
                listString.add(Integer.toString(rand.nextInt(500)));
            System.out.println(listString);
            luckySort(listString, String::compareTo);
            System.out.println(listString);
        }
}
