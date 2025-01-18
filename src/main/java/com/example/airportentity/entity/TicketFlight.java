package com.example.airportentity.entity;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "ticket_flights", schema = "bookings")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class TicketFlight {
    @EmbeddedId
    private BoardingAndFlightPassId id;

    @ManyToOne
    @JoinColumn(name = "ticket_no", nullable = false)
    @MapsId("ticket")
    private Ticket ticket;

    @ManyToOne
    @JoinColumn(name = "flight_id", nullable = false)
    @MapsId("flight")
    private Flight flight;

    @Column(name = "fare_conditions", nullable = false)
    private String fareConditions;

    @Column(name = "amount", nullable = false)
    private BigDecimal amount;

}

