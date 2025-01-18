package com.example.airportentity.example;

import com.example.airportentity.view.FlightsView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightsViewRepository extends JpaRepository<FlightsView,Long> {
}
