package com.careerdevs.PokemonAPI.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class PokemonsController {

    private final String pokemonAPIEndpoint = "https://pokeapi.co/api/v2/";


    @GetMapping("/pokemons")
    public Object pokemonData (RestTemplate restTemplate) {
        return restTemplate.getForObject(pokemonAPIEndpoint + "pokemon", Object.class);

    }

    @GetMapping("/pokemons/{id}")
    public Object pokemonById (RestTemplate restTemplate, @PathVariable String id){
        return restTemplate.getForObject(pokemonAPIEndpoint+ "pokemon/" + id, Object.class);
    }
}
