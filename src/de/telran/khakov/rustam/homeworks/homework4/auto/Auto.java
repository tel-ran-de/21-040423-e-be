package de.telran.khakov.rustam.homeworks.homework4.auto;

import java.util.Arrays;
import java.util.Random;

public abstract class Auto {
    private int releaseYear;
    private String brand;
    private String model;
    private Tire[] tires = {Tire.SUMMER, Tire.SUMMER, Tire.SUMMER, Tire.SUMMER};
    private boolean isBroken;
    protected FuelType fuelType;

    public Auto(int releaseYear, String brand, String model) {
        this.releaseYear = releaseYear;
        this.brand = brand;
        this.model = model;
        this.isBroken = false;
    }

    public void fillTank(FuelType fuelType) {
        if (fuelType != this.fuelType) {
            System.out.println("Топливо не поддерживается");
        }
    }

    public void drive() {
        if (!isBroken) {
            System.out.println("drive");
            Random random = new Random();
            if (random.nextInt(100) < 10) {
                breakDown();
            }
        } else {
            System.out.println("Car is broken, cannot drive");
        }
    }

    private void breakDown() {
        isBroken = true;
        System.out.println("break down");
    }

    public void repair() {
        isBroken = false;
    }

    public void turnOn() {
        System.out.println("turn on");
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Tire[] getTires() {
        return tires;
    }

    public void setTires(Tire[] tires) {
        this.tires = tires;
    }

    public boolean isBroken() {
        return isBroken;
    }


    @Override
    public String toString() {
        return "Auto{" +
                "releaseYear=" + releaseYear +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", tires=" + Arrays.toString(tires) +
                ", isBroken=" + isBroken +
                '}';
    }
}
