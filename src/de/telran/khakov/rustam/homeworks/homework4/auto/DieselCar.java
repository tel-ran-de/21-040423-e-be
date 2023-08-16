package de.telran.khakov.rustam.homeworks.homework4.auto;

public class DieselCar extends Auto {

    public DieselCar(int releaseYear, String brand, String model) {
        super(releaseYear, brand, model);
        this.fuelType = FuelType.DIESEL;
    }

}
