package ua.vlasoveugene.ecobikebyvlasov.view;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class Bike implements Serializable {
    protected String bikeType;
    protected String brand;
    protected int countOfGears;
    protected int wheelSize;
    protected int weight;
    protected boolean forwardBackLight;
    protected int maxSpeed;
    protected int batteryCapacity;
    protected String color;
    protected BigDecimal price;

    public Bike() {
    }

    public Bike(String bikeType, String brand, int countOfGears,
                int wheelSize, int weight, boolean forwardBackLight,
                int maxSpeed, int batteryCapacity, String color,
                BigDecimal price) {
        this.bikeType = bikeType;
        this.brand = brand;
        this.countOfGears = countOfGears;
        this.wheelSize = wheelSize;
        this.weight = weight;
        this.forwardBackLight = forwardBackLight;
        this.maxSpeed = maxSpeed;
        this.batteryCapacity = batteryCapacity;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bike)) return false;
        Bike bike = (Bike) o;
        return countOfGears == bike.countOfGears &&
                wheelSize == bike.wheelSize &&
                weight == bike.weight &&
                forwardBackLight == bike.forwardBackLight &&
                maxSpeed == bike.maxSpeed &&
                batteryCapacity == bike.batteryCapacity &&
                bikeType.equals(bike.bikeType) &&
                brand.equals(bike.brand) &&
                color.equals(bike.color) &&
                price.equals(bike.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bikeType, brand, countOfGears,
                wheelSize, weight, forwardBackLight,
                maxSpeed, batteryCapacity, color, price);
    }

    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCountOfGears() {
        return countOfGears;
    }

    public void setCountOfGears(int countOfGears) {
        this.countOfGears = countOfGears;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isForwardBackLight() {
        return forwardBackLight;
    }

    public void setForwardBackLight(boolean forwardBackLight) {
        this.forwardBackLight = forwardBackLight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
