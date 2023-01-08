package com.careerdevs.PokemonAPI.controllers;

import com.careerdevs.PokemonAPI.models.PokemonModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/pokemons")
public class PokemonsController {

    private final String pokemonAPIEndpoint = "https://pokeapi.co/api/v2/pokemon";


    @GetMapping("/all")
    public ResponseEntity<?> allPokemonData (RestTemplate restTemplate) {
        Object response = restTemplate.getForObject(pokemonAPIEndpoint, Object.class);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> pokemonById (RestTemplate restTemplate, @PathVariable String id){
        String url = pokemonAPIEndpoint + "/"+ id;
        PokemonModel response = restTemplate.getForObject(url, PokemonModel.class);
        return ResponseEntity.ok(response);
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> pokemonByName (RestTemplate restTemplate, @PathVariable String name){
        String url = pokemonAPIEndpoint + "/"+ name;
        PokemonModel response = restTemplate.getForObject(url, PokemonModel.class);
        return ResponseEntity.ok(response);
    }
}
