package Ex2;

public class Employee implements Measurable {

    private String name;
    private double salary;


    public Employee(){
        this.name = "Ivan";
        this.salary = 0;
    }

    public Employee(double salary, String name){
        if (salary <=0){
            System.err.println("Неверное введена зарплата.");
            return;
        }
        this.name = name;
        this.salary = salary;
    }

    public void setSalary(double salary){
        if (salary <=0){
            System.err.println("Неверное введена зарплата.");
            return;
        }else
            this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getMeasure() {
        return salary;
    }


//    public double average(Measurable[] objects){
//        double sum = 0;
//        for(int i = 0; i < objects.length; i++){
//            sum += objects[i].getMeasure();
//        }
//        return (sum/ objects.length);
//    }
}
