package com.example.airportentity.example;

import com.example.airportentity.view.FlightsView;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
@Slf4j
public class FligstController {
    private final FlightsViewRepository flightsViewRepository;

    @GetMapping("/view")
    public List<FlightsView> get() {
        return flightsViewRepository.findAll();
    }
}
