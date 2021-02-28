package by.shag.java;

public class Milk extends Product {

    private MilkBrand brand;
    private Tare tare;
    private double volume;

    public MilkBrand getBrand() {
        return brand;
    }

    public void setBrand(MilkBrand brand) {
        this.brand = brand;
    }

    public Tare getTare() {
        return tare;
    }

    public void setTare(Tare tare) {
        this.tare = tare;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }


    @Override
    public String toString() {
        return "Milk{" +
                "brand=" + brand +
                ", tare=" + tare +
                ", volume=" + volume +
                "} " + super.toString();
    }
}
