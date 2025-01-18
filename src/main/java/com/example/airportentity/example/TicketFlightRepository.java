package com.example.airportentity.example;


import com.example.airportentity.entity.TicketFlight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketFlightRepository extends JpaRepository<TicketFlight,Long> {
    List<TicketFlight> findByFareConditions(String conditions);
}
