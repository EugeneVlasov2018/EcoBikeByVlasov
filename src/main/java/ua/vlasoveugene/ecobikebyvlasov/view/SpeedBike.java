package ua.vlasoveugene.ecobikebyvlasov.view;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Builder
public class SpeedBike extends Bike {
    protected String bikeType;
    protected String brand;
    protected int maxSpeed;
    protected int weight;
    protected boolean forwardBackLight;
    protected int batteryCapacity;
    protected String color;
    protected BigDecimal price;

}
