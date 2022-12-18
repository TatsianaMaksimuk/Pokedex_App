package com.careerdevs.PokemonAPI.controllers;

import com.careerdevs.PokemonAPI.models.LocationModel;
import com.careerdevs.PokemonAPI.models.PokemonModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/locations")
public class LocationController {

    private final String locationAPIEndpoint = "https://pokeapi.co/api/v2/location";

    @GetMapping("/all")
    public ResponseEntity<?> allLocationsData (RestTemplate restTemplate) {
        Object response = restTemplate.getForObject(locationAPIEndpoint, Object.class);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> locationById (RestTemplate restTemplate, @PathVariable String id){
        String url = locationAPIEndpoint + "/"+ id;
        LocationModel response = restTemplate.getForObject(url, LocationModel.class);
        return ResponseEntity.ok(response);
    }
}
