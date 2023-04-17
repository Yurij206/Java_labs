import java.util.Arrays;
import java.util.Comparator;

public class task14 {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Alex", 1000),
                new Employee("David", 3000),
                new Employee("Jo", 2000),
                new Employee("Kate", 1000),
                new Employee("Mary", 2000),
                new Employee("Paul", 3000),
                new Employee("Peter", 2000),
                new Employee("Bob", 3000)
        };
        for(Employee employee:employees) {
            System.out.println(employee);
        }
        Arrays.sort(employees, Comparator.comparing(Employee::getSalary).reversed().thenComparing(Employee::getName));
        System.out.println("\nafter sort\n");
        for(Employee employee:employees) {
            System.out.println(employee);
        }
    }
}