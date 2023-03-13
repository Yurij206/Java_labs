package lab2.lab2_9;

public class car {
    private double distance;
    private final double max_fuel_level = 50;
    private double fuel_level;
    private double fuel_consumption;
    public car( double fuel_consumption){
        this.fuel_consumption=fuel_consumption;
    }
    public void movement(int quantity_kilometers)
    {
        if(fuel_level >= quantity_kilometers*fuel_consumption) {
            fuel_level -= quantity_kilometers * fuel_consumption;
            distance += quantity_kilometers;
        }
        else {
            System.out.println("Не хватает топлива. Заправьтесь, или выберите меньшее расстояние.");
        }
    }
    public void refueling(int quantity_fuel){
        if(fuel_level+quantity_fuel <= max_fuel_level) {
           fuel_level += quantity_fuel;
        }
        else{
            System.out.println("В машину не влезает столько топлива, поэтоу её заправили до максимума.");
            fuel_level= max_fuel_level;
        }
    }
    public double getDistance(){
        return distance;
    }
    public double getFuel_level(){
        return fuel_level;
    }
    public static void main(String[] args){
        car lada = new car(0.5);
        lada.refueling(60);
        lada.getFuel_level();
        System.out.println("Количество топлива: " + lada.getFuel_level());
        lada.movement(50);
        System.out.println("Проеденное расстояние: " + lada.getDistance() + "\nКоличество топлива: " + lada.getFuel_level());
    }
}
