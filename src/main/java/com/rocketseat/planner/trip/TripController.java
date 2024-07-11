package com.rocketseat.planner.trip;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trips")
public class TripController {
  public ResponseEntity<String> createTrip(@RequestBody TripRequestPayload) {
    Trip newTrip = new Trip(payload);

    
  }
}