package com.careerdevs.PokemonAPI.controllers;

import com.careerdevs.PokemonAPI.models.BerryModel;
import com.careerdevs.PokemonAPI.models.PokemonModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api/berries")
public class BerryController {

 private final String berryAPIEndpoint ="https://pokeapi.co/api/v2/berry/";



    @GetMapping("/all")
    public ResponseEntity<?> allBerriesData (RestTemplate restTemplate){
        Object response = restTemplate.getForObject(berryAPIEndpoint, Object.class);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> berryById (RestTemplate restTemplate, @PathVariable String id){
        String url = berryAPIEndpoint + "/"+ id;
        BerryModel response = restTemplate.getForObject(url, BerryModel.class);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> BerryByName (RestTemplate restTemplate, @PathVariable String name){
        String url = berryAPIEndpoint + "/"+ name;
        BerryModel response = restTemplate.getForObject(url, BerryModel.class);
        return ResponseEntity.ok(response);
    }
}
