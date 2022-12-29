package com.careerdevs.PokemonAPI.controllers;

import com.careerdevs.PokemonAPI.models.EncounterModel;
import com.careerdevs.PokemonAPI.models.LocationModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api/encounters")
public class EncounterController {
    private final String encounterAPIEndpoint = "https://pokeapi.co/api/v2/encounter-method/";

    @GetMapping("/all")
    public ResponseEntity<?> allEncounterData (RestTemplate restTemplate) {
        Object response = restTemplate.getForObject(encounterAPIEndpoint, Object.class);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> encounterById (RestTemplate restTemplate, @PathVariable String id){
        String url = encounterAPIEndpoint + "/"+ id;
        EncounterModel response = restTemplate.getForObject(url, EncounterModel.class);
        return ResponseEntity.ok(response);
    }
}
