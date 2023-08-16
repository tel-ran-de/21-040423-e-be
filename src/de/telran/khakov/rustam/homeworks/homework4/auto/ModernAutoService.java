package de.telran.khakov.rustam.homeworks.homework4.auto;

import java.util.Arrays;

public class ModernAutoService implements AutoService {

    @Override
    public Auto repairCar(Auto car) {
        if (car.isBroken()) {
            car.repair();
        }
        System.out.println("the car is repaired");
        return car;
    }

    @Override
    public void replaceTires(Auto car, Tire tireType) {
        Tire[] newTires = new Tire[4];
        Arrays.fill(newTires, tireType);
        car.setTires(newTires);
    }
}
