package com.careerdevs.PokemonAPI.controllers;

import com.careerdevs.PokemonAPI.models.PokemonSpeciesModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/pokespecies")
public class PokemonSpeciesController {

    private final String pokeSpeciesApiEndpoint = "https://pokeapi.co/api/v2/pokemon-species";

    @GetMapping("/all")
    public ResponseEntity<?> allSpeciesData(RestTemplate restTemplate) {
        Object response = restTemplate.getForObject(pokeSpeciesApiEndpoint, Object.class);
        return ResponseEntity.ok(response);
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> speciesById(RestTemplate restTemplate, @PathVariable String id) {
        String url = pokeSpeciesApiEndpoint + "/" + id;
        PokemonSpeciesModel response = restTemplate.getForObject(url, PokemonSpeciesModel.class);
        return ResponseEntity.ok(response);
    }
}