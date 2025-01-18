package com.example.airportentity.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "seats", schema = "bookings")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Seat {

    @Id
    @Column(name = "seat_no", length = 4, nullable = false)
    private String seatNo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "aircraft_code", nullable = false)
    @JsonIgnore
    private Aircraft aircraft;

    @Column(name = "fare_conditions", nullable = false)
    private String fareConditions;

}
