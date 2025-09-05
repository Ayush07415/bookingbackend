package sih.backend.sikkim.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class BookingRequest {
    private String fullName;
    private String email;
    private String phone;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private Integer guests;
    private String packageId;
    private Integer totalPrice;
}
