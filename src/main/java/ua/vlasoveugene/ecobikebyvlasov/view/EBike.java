package ua.vlasoveugene.ecobikebyvlasov.view;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Builder
public class EBike extends Bike {
    private String bikeType;
    private String brand;
    private int maxSpeed;
    private int weight;
    private boolean forwardBackLight;
    private int batteryCapacity;
    private String color;
    private BigDecimal price;
}
