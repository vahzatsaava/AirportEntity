package com.example.airportentity.view;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Subselect;
import java.sql.Timestamp;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;




@Entity
@Subselect("SELECT * FROM bookings.flights_v")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FlightsView {

    @Id
    @Column(name = "flight_id")
    private Integer flightId;

    @JdbcTypeCode(SqlTypes.CHAR)
    @Column(name = "flight_no", length = 6)
    private String flightNo;

    @Column(name = "scheduled_departure")
    private Timestamp scheduledDeparture;

    @Column(name = "scheduled_departure_local")
    private Timestamp scheduledDepartureLocal;

    @Column(name = "scheduled_arrival")
    private Timestamp scheduledArrival;

    @Column(name = "scheduled_arrival_local")
    private Timestamp scheduledArrivalLocal;

    @Column(name = "scheduled_duration")
    private String scheduledDuration;

    @JdbcTypeCode(SqlTypes.CHAR)
    @Column(name = "departure_airport", length = 3)
    private String departureAirport;

    @Column(name = "departure_airport_name")
    private String departureAirportName;

    @Column(name = "departure_city")
    private String departureCity;

    @JdbcTypeCode(SqlTypes.CHAR)
    @Column(name = "arrival_airport", length = 3)
    private String arrivalAirport;

    @Column(name = "arrival_airport_name")
    private String arrivalAirportName;

    @Column(name = "arrival_city")
    private String arrivalCity;

    @Column(name = "status")
    private String status;

    @JdbcTypeCode(SqlTypes.CHAR)
    @Column(name = "aircraft_code", length = 3)
    private String aircraftCode;

    @Column(name = "actual_departure")
    private Timestamp actualDeparture;

    @Column(name = "actual_departure_local")
    private Timestamp actualDepartureLocal;

    @Column(name = "actual_arrival")
    private Timestamp actualArrival;

    @Column(name = "actual_arrival_local")
    private Timestamp actualArrivalLocal;

    @Column(name = "actual_duration")
    private String actualDuration;
}
