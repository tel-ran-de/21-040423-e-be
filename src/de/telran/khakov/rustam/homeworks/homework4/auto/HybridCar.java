package de.telran.khakov.rustam.homeworks.homework4.auto;

public class HybridCar extends Auto {

    public HybridCar(int releaseYear, String brand, String model) {
        super(releaseYear, brand, model);
        this.fuelType = FuelType.HYBRID;
    }

    @Override
    public void fillTank(FuelType fuelType) {
        if (fuelType != FuelType.PETROL && fuelType != FuelType.ELECTRIC) {
            System.out.println("Not supported fuel type");
        }
    }
}
