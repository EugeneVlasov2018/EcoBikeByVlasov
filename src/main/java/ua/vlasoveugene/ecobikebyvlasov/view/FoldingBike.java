package ua.vlasoveugene.ecobikebyvlasov.view;


import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Builder
public class FoldingBike extends Bike {
    private String bikeType;
    private String brand;
    private int wheelSize;
    private int countOfGears;
    private int weight;
    private boolean forwardBackLight;
    private String color;
    private BigDecimal price;
}
