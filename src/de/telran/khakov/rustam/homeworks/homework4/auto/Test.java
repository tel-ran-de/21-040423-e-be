package de.telran.khakov.rustam.homeworks.homework4.auto;

public class Test {

    public static void main(String[] args) {
        Auto car = new ElectricCar(2020, "Tesla", "sport");
        car.turnOn();
        car.drive();
        car.drive();
        car.drive();
        car.drive();
        car.drive();
        car.drive();
        car.drive();
        car.drive();
        car.drive();
        car.drive();


        System.out.println(car);
        AutoService autoService = new ModernAutoService();
        if (car.isBroken()) {
            autoService.repairCar(car);
        }
        autoService.replaceTires(car, Tire.WINTER);
        System.out.println(car);
    }
}
