public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + "\t" + salary;
    }

    String getName() {
        return name;
    }

    double getSalary() {
        return salary;
    }
}
