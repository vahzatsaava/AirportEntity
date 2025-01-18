package com.example.airportentity.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.sql.Timestamp;
import java.util.List;


@Entity
@Table(name = "flights", schema = "bookings")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "flight_id", nullable = false)
    private Integer flightId;

    @JdbcTypeCode(SqlTypes.CHAR)
    @Column(name = "flight_no", length = 6, nullable = false)
    private String flightNo;

    @Column(name = "scheduled_departure", nullable = false)
    private Timestamp scheduledDeparture;

    @Column(name = "scheduled_arrival", nullable = false)
    private Timestamp scheduledArrival;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "departure_airport", nullable = false)
    @JsonIgnore
    private Airport departureAirport;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "arrival_airport", nullable = false)
    @JsonIgnore
    private Airport arrivalAirport;

    @Column(name = "status", nullable = false)
    private String status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "aircraft_code", nullable = false)
    @JsonIgnore
    private Aircraft aircraft;

    @Column(name = "actual_departure")
    private Timestamp actualDeparture;

    @Column(name = "actual_arrival")
    private Timestamp actualArrival;

    @OneToMany(mappedBy = "flight", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<TicketFlight> ticketFlights;

    @OneToMany(mappedBy = "flight", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<BoardingPass> boardingPasses;

}

