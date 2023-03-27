package lab2.lab2_9;

import java.util.Scanner;

public class car {
    private double distance_0X;
    private double distance;
    private final double max_fuel_level = 50;
    private double fuel_level;

    private final double fuel_consumption;
    public car( double fuel_consumption){
        this.fuel_consumption=fuel_consumption;
    }
    public void movement(double quantity_kilometers)
    {
        if(fuel_level >= Math.abs(quantity_kilometers)*fuel_consumption) {
            fuel_level -= Math.abs(quantity_kilometers) * fuel_consumption;
            distance+=Math.abs(quantity_kilometers);
            distance_0X += quantity_kilometers;
        }
        else {
            System.out.println("Не хватает топлива. Заправьтесь, или выберите меньшее расстояние.");
        }
    }
    public void refueling(double quantity_fuel){
        if(fuel_level+quantity_fuel <= max_fuel_level) {
           fuel_level += quantity_fuel;
        }
        else{
            System.out.println("В машину не влезает столько топлива, поэтоу её заправили до максимума.");
            fuel_level= max_fuel_level;
        }
    }
    public double getDistance_0X(){
        return distance_0X;
    }
    public double getDistance(){
        return distance;
    }
    public double getFuel_level(){
        return fuel_level;
    }
    public static int checkintinput() {
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            return in.nextInt();
        } else {
            throw new RuntimeException("It's not int number!");
        }
    }
    public static double checkdoubleinput() {
        Scanner in = new Scanner(System.in);
        if (in.hasNextDouble()) {
            return in.nextDouble();
        } else {
            throw new RuntimeException("It's not double number!");
        }
    }
    public static void main(String[] args){
        int a=0;
        car lada = new car(0.5);
        while(a==0){
            System.out.println("Сделайте выбор:\n1)Вывести количество топлива\n2)Вывести проеденную дистанцию\n" +
                    "3)Вывести расстояние до OX\n4)Проехать расстояние" +
                    "\n5)Долить топлива\n6)Выход из системы\nВаш выбор: ");
            int vibor=checkintinput();
            switch (vibor) {
                case (1) -> System.out.println(lada.getFuel_level());
                case (2) -> System.out.println(lada.getDistance());
                case (3) -> System.out.println(lada.getDistance_0X());
                case (4) -> {
                    System.out.println("Введите расстояние(положительное или отрицательное:)");
                    double dist = checkdoubleinput();
                    lada.movement(dist);
                }
                case (5) -> {
                    System.out.println("Введите количество топлива");
                    double lvl_fuel = checkdoubleinput();
                    lada.refueling(lvl_fuel);
                }
                case (6) -> {
                    a = 1;
                    System.out.print("Goodbye");
                }
                default -> System.out.println("Введите значение от 1 до 6");
            }
        }
    }
}
