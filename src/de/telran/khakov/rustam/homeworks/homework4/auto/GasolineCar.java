package de.telran.khakov.rustam.homeworks.homework4.auto;

public class GasolineCar extends Auto {

    public GasolineCar(int releaseYear, String brand, String model) {
        super(releaseYear, brand, model);
        this.fuelType = FuelType.PETROL;
    }
}
