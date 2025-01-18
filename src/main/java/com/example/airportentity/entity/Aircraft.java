package com.example.airportentity.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "aircrafts", schema = "bookings")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Aircraft {

    @Id
    @JdbcTypeCode(SqlTypes.CHAR)
    @Column(name = "aircraft_code", length = 3)
    private String aircraftCode;

    @Column(name = "model", nullable = false)
    private String model;

    @Column(name = "range", nullable = false)
    private int range;

    @OneToMany(mappedBy = "aircraft", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Flight> flights = new ArrayList<>();

    @OneToMany(mappedBy = "aircraft", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Seat> seats = new ArrayList<>();
}

