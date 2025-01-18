package com.example.airportentity.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "bookings", schema = "bookings")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Booking {

    @Id
    @JdbcTypeCode(SqlTypes.CHAR)
    @Column(name = "book_ref", length = 6, nullable = false)
    private String bookRef;

    @Column(name = "book_date", nullable = false)
    private Timestamp bookDate;

    @Column(name = "total_amount", nullable = false)
    private BigDecimal totalAmount;


    @OneToMany(mappedBy = "booking", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Ticket> tickets;

}

