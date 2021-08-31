package eu.senla.ecabtask.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookingDto {

    private Long id;
    private boolean asap;
    private int waitingTime;
    private int numberOfPassengers;
    private BigDecimal price;
    private BigDecimal rating;
}
