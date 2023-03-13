package lab1;
import java.util.*;
import java.util.stream.Collectors;

public class lab1_16 {
    public static void main(String[] args){
        System.out.print("Enter double numbers:");
        List<Double> double_mass= checknumberinput();
        double first = double_mass.get(0);
        double_mass.remove(0);
        double ave = average(first, double_mass);
        System.out.println(ave);
    }
    public static double average(double first,List<Double> values) {
        double sum = first;
        for (double v : values) sum += v;
        return sum / (values.size() +1);
    }
    public static List<Double> checknumberinput() {
        Scanner in = new Scanner(System.in);
        String line= in.nextLine();
        List<Double> numbers = Arrays.stream(line.trim().split("\\s+")).map(Double::parseDouble).collect(Collectors.toList());
        return numbers;
    }
}
