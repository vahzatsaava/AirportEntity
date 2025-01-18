package com.example.airportentity.entity;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
public class BoardingAndFlightPassId implements Serializable {
    private String ticket;
    private Integer flight;
}
