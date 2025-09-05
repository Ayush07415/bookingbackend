package sih.backend.sikkim.model;


import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bookings")

public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private LocalDate checkInDate;

    @Column(nullable = false)
    private LocalDate checkOutDate;

    @Column(nullable = false)
    private Integer guests;

    @Column(nullable = false)
    private String packageId; // e.g., "heritage_trail"

    @Column(nullable = false)
    private Integer totalPrice;

    @Column(nullable = false)
    private String status = "PENDING";

}
