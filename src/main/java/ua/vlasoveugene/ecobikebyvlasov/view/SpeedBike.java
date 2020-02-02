package ua.vlasoveugene.ecobikebyvlasov.view;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@EqualsAndHashCode
public class SpeedBike extends Bike {
    public SpeedBike(String bikeType,
                     String brand,
                     int countOfGears,
                     int wheelSize,
                     int weight,
                     boolean forwardBackLight,
                     int maxSpeed,
                     int batteryCapacity,
                     String color,
                     BigDecimal price) {

        super(bikeType, brand, countOfGears,
                wheelSize, weight, forwardBackLight,
                maxSpeed, batteryCapacity, color, price);
    }
}
