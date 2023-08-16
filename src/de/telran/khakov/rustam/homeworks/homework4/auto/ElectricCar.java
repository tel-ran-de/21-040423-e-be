package de.telran.khakov.rustam.homeworks.homework4.auto;

public class ElectricCar extends Auto {

    public ElectricCar(int releaseYear, String brand, String model) {
        super(releaseYear, brand, model);
        this.fuelType = FuelType.ELECTRIC;
    }
}
