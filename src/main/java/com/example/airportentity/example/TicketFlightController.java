package com.example.airportentity.example;

import com.example.airportentity.entity.TicketFlight;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/flights")
@RequiredArgsConstructor
@Slf4j
public class TicketFlightController {

    private final TicketFlightRepository ticketFlightRepository;

    @GetMapping("/all")
    public List<TicketFlight> getAll(){
        return ticketFlightRepository.findAll();
    }

    @GetMapping("/bussines")
    public List<TicketFlight> getByConditions(){

        return ticketFlightRepository.findByFareConditions("Business");
    }
}
