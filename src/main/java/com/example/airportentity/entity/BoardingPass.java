package com.example.airportentity.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Entity
@Table(name = "boarding_passes", schema = "bookings")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class BoardingPass {
    @EmbeddedId
    private BoardingAndFlightPassId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ticket_no", nullable = false)
    @JdbcTypeCode(SqlTypes.CHAR)
    @MapsId("ticket")
    @JsonIgnore
    private Ticket ticket;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "flight_id", nullable = false)
    @MapsId("flight")
    @JsonIgnore
    private Flight flight;

    @Column(name = "boarding_no")
    private Integer boardingNo;

    @Column(name = "seat_no")
    private String seatNo;

}

