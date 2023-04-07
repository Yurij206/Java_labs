package Ex1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {



    public static void main(String[] args) {


        ArrayList<Measurable> employee = new ArrayList<>();
        int x = 0;
        Scanner in = new Scanner(System.in);


        do{
            System.out.println("1.Добавить работников \n2.Посчитать среднюю зарплату \n3.Вывести всех работников\n4.Удалить работника\n5.Выход");
            if (in.hasNextInt()) {
                x = in.nextInt();
            }else {
                System.out.println("Введено неверное число!");
                break;
            }
            if (x != 1 && x != 2 && x != 3 && x != 4 && x != 5){
                System.out.println("Неверный ввод");
                continue;
            }
            if (x == 1){
                int q = 0;
                System.out.println("Введите кол-во работников:");
                if (in.hasNextInt()) {
                    q = in.nextInt();
                }else {
                    System.err.println("Введено неверное число!");
                    break;
                }
                if(q<=0){
                    System.out.println("Неверное кол-во");
                    continue;
                }else{
                    for(int i = 0; i<q; i++) {
                        System.out.println("Введите зарплату работника №" + (i + 1) + ":");
                        double salary = 0;
                        while (salary <= 0){
                            if (in.hasNextDouble()) {
                                salary = in.nextDouble();
                                if (salary <= 0) {
                                    System.err.println("Неверное введена зарплата.");
                                    System.out.println("Повторите Ввод:");
                                } else {
                                    employee.add(new Employee(salary));
                                }
                            } else {
                                System.err.println("Введено неверное число!");
                                break;
                            }
                    }
                    }
                }
            }
            if (x == 2){
                if(employee.isEmpty()){
                    System.err.println("Работников нет.");
                    continue;
                }
                Average average = new Average();
                average.objects = employee;
                System.out.println(average.average());
            }
            if(x == 3){
                if(employee.isEmpty()){
                    System.err.println("Нет работников.");
                    continue;
                }
                for(int i = 0; i<employee.size(); i++){
                    System.out.println("Работник №" + (i+1) + " зарабатывает " + employee.get(i).getMeasure());
                }
            }

            if (x == 4){
                if(employee.isEmpty()){
                    System.err.println("Нет работников.");
                    continue;
                }
                System.out.println("Введите номер работника для удаления: ");
                int ind = -1;
                if (in.hasNextInt()){
                    ind = in.nextInt();
                }else {
                    System.err.println("Введено неверное число!");
                    break;
                }
                ind = ind - 1;
                if (ind >= employee.size() || ind < 0){
                    System.err.println("Нет такого работника.");
                    continue;
                }else {
                    employee.remove(ind);
                }
            }
        }while (x!=5);

    }


}
