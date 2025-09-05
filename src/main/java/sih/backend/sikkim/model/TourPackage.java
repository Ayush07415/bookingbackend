package sih.backend.sikkim.model;


import jakarta.persistence.*;
import java.util.List;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tour_packages")

public class TourPackage {

    @Id
    private String id; // e.g., "heritage_trail"

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String duration;

    @Column(nullable = false)
    private Integer price;

    @ElementCollection
    private List<String> includes;

    @ElementCollection
    private List<String> monasteries;

    @Column(nullable = false)
    private Double rating;
}
