package com.example.airportentity.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "airports", schema = "bookings")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Airport {

    @Id
    @JdbcTypeCode(SqlTypes.CHAR)
    @Column(name = "airport_code", length = 3)
    private String airportCode;

    @Column(name = "airport_name", nullable = false)
    private String airportName;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "longitude", nullable = false)
    private Double longitude;

    @Column(name = "latitude", nullable = false)
    private Double latitude;

    @Column(name = "timezone", nullable = false)
    private String timezone;

    @OneToMany(mappedBy = "departureAirport", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Flight> departingFlights = new ArrayList<>();

    @OneToMany(mappedBy = "arrivalAirport", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Flight> arrivingFlights = new ArrayList<>();
}
